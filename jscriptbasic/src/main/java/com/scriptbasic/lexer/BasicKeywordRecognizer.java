package com.scriptbasic.lexer;

import java.io.IOException;
import java.util.Set;

import com.scriptbasic.interfaces.KeywordRecognizer;
import com.scriptbasic.utility.RegexpCommentFilter;
import com.scriptbasic.utility.TextFileResource;

public class BasicKeywordRecognizer implements KeywordRecognizer {
    private static Set<String> keywords;

    static {
        try {
            keywords = new TextFileResource(BasicKeywordRecognizer.class,
                    "keywords.txt").stripSpaces().stripEmptyLines()
                    .stripComments(new RegexpCommentFilter("^#.*")).getSet();
        } catch (final IOException e) {
            keywords = null;
        }
    }

    public static Set<String> getKeywords() {
        return keywords;
    }

    public static void setKeywords(final Set<String> kwords) {
        keywords = kwords;
    }

    @Override
    public boolean isRecognized(final String identifier) {
        return keywords.contains(identifier.toLowerCase());
    }

}