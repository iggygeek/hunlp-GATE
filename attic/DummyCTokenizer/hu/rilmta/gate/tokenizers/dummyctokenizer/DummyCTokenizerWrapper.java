/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hu.rilmta.gate.tokenizers.dummyctokenizer;

public class DummyCTokenizerWrapper {
  public static void tokenize(String text, OffsPair tokens, int[] ntokens, int maxtokens, OffsPair whites, int[] nwhites, int maxwhites) {
    DummyCTokenizerWrapperJNI.tokenize(text, OffsPair.getCPtr(tokens), tokens, ntokens, maxtokens, OffsPair.getCPtr(whites), whites, nwhites, maxwhites);
  }

}
