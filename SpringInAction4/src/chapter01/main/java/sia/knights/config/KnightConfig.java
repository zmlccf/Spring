package chapter01.main.java.sia.knights.config;

import chapter01.main.java.sia.knights.BraveKnight;
import chapter01.main.java.sia.knights.Knight;
import chapter01.main.java.sia.knights.Quest;
import chapter01.main.java.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
