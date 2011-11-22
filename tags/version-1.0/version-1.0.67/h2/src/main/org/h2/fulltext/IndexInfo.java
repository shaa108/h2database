/*
 * Copyright 2004-2008 H2 Group. Licensed under the H2 License, Version 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.fulltext;

/**
 * The settings of one full text search index.
 */
public class IndexInfo {
    int id;
    String schemaName;
    String tableName;
    int[] keys;
    int[] indexColumns;
    String[] columnNames;
}