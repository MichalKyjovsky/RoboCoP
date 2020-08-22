package cz.cuni.mff.kyjovsm.robocop.elements;

import com.google.common.base.Optional;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import cz.cuni.mff.kyjovsm.robocop.ElementFactory;
import cz.cuni.mff.kyjovsm.robocop.elements.presentations.RobotFrameworkKeywordNamePresentation;
import cz.cuni.mff.kyjovsm.robocop.elements.presentations.RobotFrameworkReferencedFilePresentation;
import cz.cuni.mff.kyjovsm.robocop.elements.presentations.RobotFrameworkTestCasePresentation;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarAssignmentStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarVariableStub;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.File;

public class RobotFrameworkImplUtil {

  /* RobotFrameworkKeywordName - Implementation of defined method - BEGIN*/
  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkKeywordName element) {
    if (element == null) {
      return null;
    }
    return element.getNameIdentifier();
  }

  public static ItemPresentation getPresentation(final RobotFrameworkKeywordName element) {
    return new RobotFrameworkKeywordNamePresentation(element);
  }

  @Nullable
  @NonNls
  public static String getName(RobotFrameworkKeywordName element) {
    RobotFrameworkKeywordNameStub stub = element.getStub();
    if (stub != null) {
      return stub.getName();
    }
    return element.getText();
  }

  public static PsiElement setName(RobotFrameworkKeywordName element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkKeywordName replacement = ElementFactory.createKeywordTitle(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  public static String toString(RobotFrameworkKeywordName element) {
    return String.format("RobotFrameworkKeywordName element: %s", getName(element));
  }

  /* RobotFrameworkKeywordName - Implementation of defined methods - END*/

  /* RobotFrameworkScalarDefaultArgValue - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkScalarDefaultArgValue element) {
    Optional<String> optVariableName = RobotFrameworkVariableUtils.getVariableName(element);
    if (optVariableName.isPresent()) {
      return optVariableName.get();
    }
    return null;
  }

  public static PsiElement setName(RobotFrameworkScalarDefaultArgValue element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkScalarDefaultArgValue replacement = ElementFactory.createScalarDefaultArgValue(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkScalarDefaultArgValue element) {
    return element;
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkScalarDefaultArgValue element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkScalarDefaultArgValue element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  public static PsiElement handleElementRename(RobotFrameworkScalarDefaultArgValue element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkScalarDefaultArgValue element) {
    return String.format("RobotScalarDefaultArgValue element: ", element.getText());
  }
  /* RobotFrameworkScalarDefaultArgValue - Implementation of defined methods - END */

  /* RobotFrameworkKeywordArgument - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkKeywordArgument element) {
    return element.getText();
  }

  public static PsiElement setName(RobotFrameworkKeywordArgument element, @NonNls @NotNull String newName) throws IncorrectOperationException {
    RobotFrameworkKeywordArgument replacement = ElementFactory.createKeywordArg(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkKeywordArgument element) {
    return element;
  }

  public static PsiElement handleElementRename(RobotFrameworkKeywordArgument element, String name) {
    return element.setName(name);
  }


  public static PsiReference getReference(RobotFrameworkKeywordArgument element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  public static PsiReference[] getReferences(RobotFrameworkKeywordArgument element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }
  /* RobotFrameworkKeywordArgument - Implementation of defined methods - END */

  /* RobotFrameworkKeyword - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkKeyword element) {
    return element.getText();
  }

  public static PsiElement setName(RobotFrameworkKeyword element, @NonNls @NotNull String newName) throws IncorrectOperationException {
    RobotFrameworkKeyword replacement = ElementFactory.createKeyword(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkKeyword element) {
    return element;
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkKeyword element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkKeyword element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  public static PsiElement handleElementRename(RobotFrameworkKeyword element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkKeyword element) {
    return element.getClass().getSimpleName() + ": " + element.getText();
  }
  /* RobotFrameworkKeyword - Implementation of defined methods - END */

  /* RobotFrameworkScalarAssignment - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkScalarAssignment element) {
    RobotFrameworkScalarAssignmentStub stub = element.getStub();
    if (stub != null) {
      return stub.getName();
    }
    Optional<String> optVariableName = RobotFrameworkVariableUtils.getVariableName(element);
    if (optVariableName.isPresent()) {
      return optVariableName.get();
    }
    return null;
  }

  public static PsiElement setName(RobotFrameworkScalarAssignment element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkScalarAssignment replacement = ElementFactory.createScalarAssignment(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkScalarAssignment element) {
    return element;
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkScalarAssignment element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkScalarAssignment element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  public static PsiElement handleElementRename(RobotFrameworkScalarAssignment element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkScalarAssignment element) {
    return String.format("RobotScalarAssignment: %s", element.getText());
  }
  /* RobotFrameworkScalarAssignment - Implementation of defined methods - END */

  /* RobotFrameworkScalarVariable - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkScalarVariable element) {
    RobotFrameworkScalarVariableStub stub = element.getStub();
    if (stub != null) {
      return stub.getName();
    }
    Optional<String> optVariableName = RobotFrameworkVariableUtils.getVariableName(element);
    if (optVariableName.isPresent()) {
      return optVariableName.get();
    }
    return null;
  }

  public static PsiElement setName(RobotFrameworkScalarVariable element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkScalarVariable replacement = ElementFactory.createScalarVariable(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkScalarVariable element) {
    return element;
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkScalarVariable element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkScalarVariable element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  public static PsiElement handleElementRename(RobotFrameworkScalarVariable element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkScalarVariable element) {
    return String.format("Robot Framework Simple Variable: %s", element.getText());
  }
  /* RobotFrameworkScalarVariable - Implementation of defined methods - END */

  /* RobotFrameworkTestCase - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkTestCase element) {
    PsiElement header = getNameIdentifier(element);
    if (header == null) {
      return null;
    }
    return header.getText();
  }

  public static PsiElement setName(RobotFrameworkTestCase element, @NonNls @NotNull String newName) throws IncorrectOperationException {
    return element;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkTestCase element) {
    if (element == null) {
      return null;
    }
    return element.getTestCaseName();
  }


  public static ItemPresentation getPresentation(final RobotFrameworkTestCase element) {
    return new RobotFrameworkTestCasePresentation(element);
  }

  public static String toString(RobotFrameworkTestCase element) {
    return element.getClass().getSimpleName() + ": " + element.getText();
  }

  /* RobotFrameworkTestCase - Implementation of defined methods - END */

  /* RobotFrameworkArgumentDefinition - Implementation of defined methods - BEGIN */

  public static PsiElement setName(RobotFrameworkArgumentDefinition element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkArgumentDefinition replacement = ElementFactory.createArgumentDef(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkArgumentDefinition element) {
    RobotFrameworkScalarVariable scalarVariable = PsiTreeUtil.findChildOfType(element, RobotFrameworkScalarVariable.class);
    if (scalarVariable != null) {
      return scalarVariable;
    }
    RobotFrameworkArgumentDefinition defaultArgValue = PsiTreeUtil.findChildOfType(element, RobotFrameworkArgumentDefinition.class);
    if (defaultArgValue != null) {
      return defaultArgValue;
    }
    RobotFrameworkArrayVariable arrayVariable = PsiTreeUtil.findChildOfType(element, RobotFrameworkArrayVariable.class);
    if (arrayVariable != null) {
      return arrayVariable;
    }
    return element;
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkArgumentDefinition element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkArgumentDefinition element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  public static PsiElement handleElementRename(RobotFrameworkArgumentDefinition element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkArgumentDefinition element) {
    return "RobotArgumentDef: " + element.getText();
  }

  @Nullable
  @NonNls
  public static String getName(RobotFrameworkArgumentDefinition element) {
    Optional<String> optVariableName = RobotFrameworkVariableUtils.getVariableName(element);
    if (optVariableName.isPresent()) {
      return optVariableName.get();
    }
    return null;
  }
  /* RobotFrameworkArgumentDefinition - Implementation of defined methods - END */

  /* RobotFrameworkReferencedFile - Implementation of defined methods - BEGIN */
  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkReferencedFile element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkReferencedFile element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  @Nullable
  @NonNls
  public static String getName(RobotFrameworkReferencedFile element) {
    final String text = element.getText();
    final int indexOfLastSlash = text.lastIndexOf(File.separatorChar);
    return text.substring(indexOfLastSlash + 1);
  }

  public static PsiElement setName(RobotFrameworkReferencedFile element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    final String oldText = element.getText();
    final int indexOfLastSlash = oldText.lastIndexOf(File.separatorChar);
    final String fullPathOfNewResourceName = oldText.substring(0, indexOfLastSlash + 1) + newName;
    RobotFrameworkReferencedFile replacement = ElementFactory.createRobotFrameworkReferencedFile(element.getProject(), fullPathOfNewResourceName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkReferencedFile element) {
    return element;
  }

  public static PsiElement handleElementRename(RobotFrameworkReferencedFile element, String name) {
    return element.setName(name);
  }

  public static ItemPresentation getPresentation(final RobotFrameworkReferencedFile element) {
    return new RobotFrameworkReferencedFilePresentation(element);
  }

  public static String toString(RobotFrameworkReferencedFile element) {
    return "Resource Setting: " + element.getText();
  }

  /* RobotFrameworkReferencedFile - Implementation of defined methods - END */

  /* RobotFrameworkScalarAssignmentLhs - Implementation of defined methods - BEGIN */
  @Nullable
  @NonNls
  public static String getName(RobotFrameworkScalarAssignmentLhs element) {
    Optional<String> optVariableName = RobotFrameworkVariableUtils.getVariableName(element);
    if (optVariableName.isPresent()) {
      return optVariableName.get();
    }
    return null;
  }

  public static PsiElement setName(RobotFrameworkScalarAssignmentLhs element, @NonNls @NotNull String newName) throws com.intellij.util.IncorrectOperationException {
    RobotFrameworkScalarAssignmentLhs replacement = ElementFactory.createScalarAssignmentLhs(element.getProject(), newName);
    element.getParent().getNode().replaceChild(element.getNode(), replacement.getNode());
    return replacement;
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkScalarAssignmentLhs element) {
    RobotFrameworkScalarAssignment assignment = PsiTreeUtil.findChildOfType(element, RobotFrameworkScalarAssignment.class);
    if (assignment != null) {
      return assignment;
    }
    RobotFrameworkScalarVariable variable = PsiTreeUtil.findChildOfType(element, RobotFrameworkScalarVariable.class);
    if (variable != null) {
      return variable;
    }
    return element;
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkScalarAssignmentLhs element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkScalarAssignmentLhs element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  public static PsiElement handleElementRename(RobotFrameworkScalarAssignmentLhs element, String name) {
    return element.setName(name);
  }

  public static String toString(RobotFrameworkScalarAssignmentLhs element) {
    return "Robot Framework Scalar Assignment Left hand side: " + element.getText();
  }
  /* RobotFrameworkScalarAssignmentLhs - Implementation of defined methods - END */
  /* RobotFrameworkLibraryReference - Implementation of defined methods - BEGIN */

  @NotNull
  public static PsiReference[] getReferences(RobotFrameworkLibraryReference element) {
    return ReferenceProvidersRegistry.getReferencesFromProviders(element);
  }

  @Nullable
  public static PsiReference getReference(RobotFrameworkLibraryReference element) {
    PsiReference[] refs = ReferenceProvidersRegistry.getReferencesFromProviders(element);
    if (refs.length <= 0) {
      return null;
    }
    return refs[0];
  }
  /* RobotFrameworkLibraryReference - Implementation of defined methods - END */
  /* RobotFrameworkTestCasesTable - Implementation of defined methods - BEGIN */

  public static ItemPresentation getPresentation(final RobotFrameworkTestCasesTable element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return "Test Case Table";
      }

      @Nullable
      @Override
      public String getLocationString() {
        return element.getContainingFile().getName();
      }

      @Nullable
      @Override
      public Icon getIcon(boolean unused) {
        return RobotFrameworkIcons.ICON_MAIN;
      }
    };
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkTestCasesTable element) {
    return element.getTestCasesTableHeader();
  }
  /* RobotFrameworkTestCasesTable - Implementation of defined methods - END */
  /* RobotFrameworkKeywordsTable - Implementation of defined methods - BEGIN */

  public static ItemPresentation getPresentation(final RobotFrameworkKeywordsTable element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return "Keywords Table";
      }

      @Nullable
      @Override
      public String getLocationString() {
        return element.getContainingFile().getName();
      }

      @Nullable
      @Override
      public Icon getIcon(boolean unused) {
        return RobotFrameworkIcons.ICON_MAIN;
      }
    };
  }

  @Nullable
  public static PsiElement getNameIdentifier(RobotFrameworkKeywordsTable element) {
    return element.getKeywordsTableHeader();
  }
  /* RobotFrameworkKeywordsTable - Implementation of defined methods - END */


}