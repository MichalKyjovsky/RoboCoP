package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;

/**
 * Purpose of this class is to define Library files used in
 * Robot Framework test scripts.
 * TODO: Replace by PythonLanguage and resolve class loaders conflict
 */
public class LibraryLanguage extends Language {

  public static final LibraryLanguage INSTANCE = new LibraryLanguage();

  @NonNls
  private static final String ID = "Python Library";

  /**
   * Constructor method in order to
   * create singleton class.
   */
  protected LibraryLanguage() {
    super(ID);
  }

  /**
   * @return Boolean value defining whether the Library file
   * is case sensitive.
   */
  @Override
  public boolean isCaseSensitive() {
    return true;
  }
}
