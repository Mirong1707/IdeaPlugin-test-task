package com.example.ideaplugin;

import com.intellij.openapi.ui.DialogWrapper;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.annotation.Nullable;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jetbrains.annotations.NotNull;

public class URLButtonsWindow extends DialogWrapper {

  public URLButtonsWindow() {
    super(true); // use current window as parent
    init();
    setTitle("Choose Site");
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    JPanel dialogPanel = new JPanel(new GridLayout(1, 2));
    JButton button1 = new JButton("Site 1");
    dialogPanel.add(button1);
    JButton button2 = new JButton("Site 2");
    dialogPanel.add(button2);

    button1.addActionListener(e -> {
      String url = "http://www.google.com";
      boolean response = new URLWindow(url).showAndGet();
    });

    button2.addActionListener(e -> {
      String url = "http://www.example.com";
      boolean response = new URLWindow(url).showAndGet();
    });

    return dialogPanel;
  }
  @Override
  protected Action @NotNull [] createActions() {
    return new Action[0]; // return an empty array of actions
  }
}