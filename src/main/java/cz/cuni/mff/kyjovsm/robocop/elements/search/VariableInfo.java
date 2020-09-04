package cz.cuni.mff.kyjovsm.robocop.elements.search;

import com.google.common.base.Preconditions;
import com.intellij.psi.PsiElement;

import java.util.Objects;

/**
 *
 */
public class VariableInfo {
  private final String value;
  private final PsiElement definition;

  /**
   * @param value
   * @param definition
   */
  public VariableInfo(String value, PsiElement definition) {
    this.value = Preconditions.checkNotNull(value);
    this.definition = Preconditions.checkNotNull(definition);
  }

  /**
   * @return
   */
  public String getValue() {
    return value;
  }

  /**
   * @return
   */
  public PsiElement getDefinition() {
    return definition;
  }

  /**
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (o == null || !o.getClass().equals(getClass())) {
      return false;
    }
    VariableInfo other = (VariableInfo) o;
    return Objects.equals(value, other.value) && Objects.equals(definition, other.definition);
  }

  /**
   * @return
   */
  @Override
  public int hashCode() {
    return (value == null ? 0 : value.hashCode()) ^ (definition == null ? 0 : definition.hashCode());
  }
}
