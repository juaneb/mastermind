package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;

public abstract class AcceptorController extends Controller {

  AcceptorController(Session session) {
    super(session);
  }

  public abstract void accept(ControllersVisitor controllersVisitor);
}
