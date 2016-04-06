package org.camunda.bpm.example.event.message;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

import java.util.logging.Logger;

/**
 * Created by hawky4s on 06.04.16.
 */
@ProcessApplication
public class MyProcessApplication extends ServletProcessApplication {

  static Logger logger = Logger.getLogger(MyProcessApplication.class.getName());

  @PostDeploy
  public void startup() {
    logger.info("'camunda-quickstart-message-startevent' deployed successfully.");
  }

}
