// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkKeywordsTable extends PsiElement {

  @NotNull
  List<RobotFrameworkEmptyLine> getEmptyLineList();

  @NotNull
  RobotFrameworkKeywordsTableHeader getKeywordsTableHeader();

  @NotNull
  List<RobotFrameworkKeywordDefinition> getKeywordDefinitionList();

  //WARNING: getNameIdentifier(...) is skipped
  //matching getNameIdentifier(RobotFrameworkKeywordsTable, ...)
  //methods are not found in RobotFrameworkImplUtil

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(RobotFrameworkKeywordsTable, ...)
  //methods are not found in RobotFrameworkImplUtil

}
