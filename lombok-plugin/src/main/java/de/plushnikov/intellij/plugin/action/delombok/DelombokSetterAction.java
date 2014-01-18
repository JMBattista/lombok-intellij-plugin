package de.plushnikov.intellij.plugin.action.delombok;

import com.intellij.codeInsight.CodeInsightActionHandler;
import org.jetbrains.annotations.NotNull;

public class DelombokSetterAction extends BaseDelombokAction {
  @NotNull
  @Override
  protected CodeInsightActionHandler getHandler() {
    return new DelombokSetterHandler();
  }
}