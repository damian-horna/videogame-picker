package pl.poznan.put.cs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class VideoGamePickerTest {
    public static void main(String[] args) {
        VideoGamePickerTest videoGamePickerTest = new VideoGamePickerTest();
        videoGamePickerTest.executeRules();
    }

    public void executeRules() {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(VideoGamePickerTest.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        session.fireAllRules();
    }
}