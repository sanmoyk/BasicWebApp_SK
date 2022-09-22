package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("tepper")) {
            return "David Tepper is a renowned investor and entrepeneur " +
                    "who owned a large billion-dollar hedge-fund with a strategy " +
                    "involving no leverage. He created quantitative models early on " +
                    "and later used his wealth to open a school at Carnegie Mellon";
        }
        if (query.toLowerCase().contains("name")) {
            return "MyTeam";
        }
        return "";
    }
}
