package com.example.ideaplugin;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.annotation.Nullable;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jetbrains.annotations.NotNull;

public class URLWindow extends DialogWrapper {
  String url;

  public URLWindow(String url) {
    super(true); // use current window as parent
    this.url = url;
    init();
    setTitle("Web");
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    JPanel dialogPanel = new JPanel(new BorderLayout());
    dialogPanel.add(new JBCefBrowser(url).getComponent());
    return dialogPanel;
  }

  @Override
  protected Action @NotNull [] createActions() {
    return new Action[0]; // return an empty array of actions
  }
}