package com.example.ideaplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class AdditionalButtonAction extends AnAction {

  public AdditionalButtonAction() {
    super();
  }

  @Override
  public void actionPerformed(@NotNull AnActionEvent event) {
    boolean response = new URLButtonsWindow().showAndGet();
  }

  @Override
  public void update(AnActionEvent e) {
    // Set the availability based on whether a project is open
    Project project = e.getProject();
    e.getPresentation().setEnabledAndVisible(project != null);
  }
}