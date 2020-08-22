// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface RobotFrameworkKeywordsTable extends PsiElement {

  @NotNull
  List<RobotFrameworkEmptyLine> getEmptyLineList();

  @NotNull
  RobotFrameworkKeywordsTableHeader getKeywordsTableHeader();

  @NotNull
  List<RobotFrameworkKeywordDefinition> getKeywordDefinitionList();

  @Nullable
  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
