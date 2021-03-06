/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.table;

/**
 *
 * @author tahir hussain
 */
public class Column1 {

    
     public Column1(String colName,int dataType){
        this.colName=colName;
        this.dataType=dataType;
   }

     public Column1(String tableCat,String tableScheme,String tableName,String colName,int dataType, String typeName, int columnSize, int bufferLength, int decimalDigits, 
            int numPrecRadix, int nullable, String remarks, String columnDef, int sqlDataType, int sqlDateTimeSub,
            int charOctetLength, int ordinalPosition, String isNullable, String scopeCatalog, String scopeSchema, 
            String scopeTable, short sourceDataType, String isAutoIncrememnt, String isGeneratedCol,boolean isPrimaryKey) {
        this.tableName=tableName;
        this.colName = colName;
        this.dataType = dataType;
        this.typeName = typeName;
        this.columnSize = columnSize;
        this.bufferLength = bufferLength;
        this.decimalDigits = decimalDigits;
        this.numPrecRadix = numPrecRadix;
        this.nullable = nullable;
        this.remarks = remarks;
        this.columnDef = columnDef;
        this.sqlDataType = sqlDataType;
        this.sqlDateTimeSub = sqlDateTimeSub;
        this.charOctetLength = charOctetLength;
        this.ordinalPosition = ordinalPosition;
        this.isNullable = isNullable;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeTable = scopeTable;
        this.sourceDataType = sourceDataType;
        this.isAutoIncrememnt = isAutoIncrememnt;
        this.isGeneratedCol = isGeneratedCol;
        this.isPrimaryKey=isPrimaryKey;
    }
     

    public String getTableCat() {
        return tableCat;
    }

    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    public String getTableSchem() {
        return tableSchem;
    }

    public void setTableSchem(String tableSchem) {
        this.tableSchem = tableSchem;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

   
 
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public int getBufferLength() {
        return bufferLength;
    }

    public void setBufferLength(int bufferLength) {
        this.bufferLength = bufferLength;
    }

    public int getDecimalDigits() {
        return decimalDigits;
    }

    public void setDecimalDigits(int decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    public int getNumPrecRadix() {
        return numPrecRadix;
    }

    public void setNumPrecRadix(int numPrecRadix) {
        this.numPrecRadix = numPrecRadix;
    }

    public int getNullable() {
        return nullable;
    }

    public void setNullable(int nullable) {
        this.nullable = nullable;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getColumnDef() {
        return columnDef;
    }

    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
    }

    public int getSqlDataType() {
        return sqlDataType;
    }

    public void setSqlDataType(int sqlDataType) {
        this.sqlDataType = sqlDataType;
    }

    public int getSqlDateTimeSub() {
        return sqlDateTimeSub;
    }

    public void setSqlDateTimeSub(int sqlDateTimeSub) {
        this.sqlDateTimeSub = sqlDateTimeSub;
    }

    public int getCharOctetLength() {
        return charOctetLength;
    }

    public void setCharOctetLength(int charOctetLength) {
        this.charOctetLength = charOctetLength;
    }

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getScopeCatalog() {
        return scopeCatalog;
    }

    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    public String getScopeSchema() {
        return scopeSchema;
    }

    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    public String getScopeTable() {
        return scopeTable;
    }

    public void setScopeTable(String scopeTable) {
        this.scopeTable = scopeTable;
    }

    public short getSourceDataType() {
        return sourceDataType;
    }

    public void setSourceDataType(short sourceDataType) {
        this.sourceDataType = sourceDataType;
    }

    public String getIsAutoIncrememnt() {
        return isAutoIncrememnt;
    }

    public void setIsAutoIncrememnt(String isAutoIncrememnt) {
        this.isAutoIncrememnt = isAutoIncrememnt;
    }

    public String getIsGeneratedCol() {
        return isGeneratedCol;
    }
    public void setIsGeneratedCol(String isGeneratedCol) {
        this.isGeneratedCol = isGeneratedCol;
    }
    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }
    
    @Override
    public String toString(){
 return tableCat+" "+
tableSchem+" "+
tableName+" "+
colName+" "+
dataType+" "+
typeName+" "+
columnSize+" "+
bufferLength+" "+
decimalDigits+" "+
numPrecRadix+" "+
nullable+" "+
remarks+" "+
columnDef+" "+
sqlDataType+" "+
sqlDateTimeSub+" "+
charOctetLength+" "+
ordinalPosition+" "+
isNullable+" "+
scopeCatalog+" "+
scopeSchema+" "+
scopeTable+" "+
sourceDataType+" "+
isAutoIncrememnt+" "+
isGeneratedCol+" "+
isPrimaryKey+" ";
    
    }

     
private String tableCat;
private String tableSchem; 
private String tableName;
private String colName;
private int dataType;
private String typeName;
private int columnSize;
private int bufferLength; 
private int decimalDigits; 
private int numPrecRadix;
private int nullable;
private String remarks;// String 
private String columnDef;   
private int sqlDataType;
private int sqlDateTimeSub;
private int charOctetLength; 
private int ordinalPosition;  
private String isNullable;  
private String scopeCatalog;  
private String scopeSchema; 
private String scopeTable; 
private short  sourceDataType;
private String isAutoIncrememnt; 
private String isGeneratedCol;
private boolean isPrimaryKey;   

    
   private static final int PRIMARY_KEY=1;
   private static final int UNIQUE_KEY=2;
   private static final int CHECK_KEY=3;
   private static final int COMPOSITE_KEY=2;
   private static final int SECONDARY_KEY=4;
   private static final int NOT_NULL=5;
}
