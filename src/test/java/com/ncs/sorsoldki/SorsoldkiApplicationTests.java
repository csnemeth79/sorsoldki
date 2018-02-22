package com.ncs.sorsoldki;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SorsoldkiApplicationTests
{

  @Rule
  public OutputCapture outputCapture = new OutputCapture();

  @Test
  public void contextLoads()
  {
    SorsoldkiApplication.main(new String[] {});
    String out = outputCapture.toString();
    assertTrue("Wrong output: " + out,
        out.contains("Started SorsoldkiApplication")
            && out.contains("jdbc:h2:mem:testdb")
    );
  }

}
