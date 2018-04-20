package chapter01.test.java.sia.knights;
import chapter01.main.java.sia.knights.BraveKnight;
import chapter01.main.java.sia.knights.Quest;
import org.junit.Test;


import static org.mockito.Mockito.*;


public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
