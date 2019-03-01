package com.lingjuan.app.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lingjuan.app.entity.FootprintRzy;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FOOTPRINT_RZY".
*/
public class FootprintRzyDao extends AbstractDao<FootprintRzy, Long> {

    public static final String TABLENAME = "FOOTPRINT_RZY";

    /**
     * Properties of entity FootprintRzy.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Itemshorttitle = new Property(1, String.class, "itemshorttitle", false, "ITEMSHORTTITLE");
        public final static Property Itemprice = new Property(2, String.class, "itemprice", false, "ITEMPRICE");
        public final static Property Itemsale = new Property(3, String.class, "itemsale", false, "ITEMSALE");
        public final static Property Couponmoney = new Property(4, String.class, "couponmoney", false, "COUPONMONEY");
        public final static Property Itemendprice = new Property(5, String.class, "itemendprice", false, "ITEMENDPRICE");
        public final static Property Itempic = new Property(6, String.class, "itempic", false, "ITEMPIC");
        public final static Property Itemid = new Property(7, String.class, "itemid", false, "ITEMID");
    }


    public FootprintRzyDao(DaoConfig config) {
        super(config);
    }
    
    public FootprintRzyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FOOTPRINT_RZY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"ITEMSHORTTITLE\" TEXT," + // 1: itemshorttitle
                "\"ITEMPRICE\" TEXT," + // 2: itemprice
                "\"ITEMSALE\" TEXT," + // 3: itemsale
                "\"COUPONMONEY\" TEXT," + // 4: couponmoney
                "\"ITEMENDPRICE\" TEXT," + // 5: itemendprice
                "\"ITEMPIC\" TEXT," + // 6: itempic
                "\"ITEMID\" TEXT);"); // 7: itemid
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FOOTPRINT_RZY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FootprintRzy entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String itemshorttitle = entity.getItemshorttitle();
        if (itemshorttitle != null) {
            stmt.bindString(2, itemshorttitle);
        }
 
        String itemprice = entity.getItemprice();
        if (itemprice != null) {
            stmt.bindString(3, itemprice);
        }
 
        String itemsale = entity.getItemsale();
        if (itemsale != null) {
            stmt.bindString(4, itemsale);
        }
 
        String couponmoney = entity.getCouponmoney();
        if (couponmoney != null) {
            stmt.bindString(5, couponmoney);
        }
 
        String itemendprice = entity.getItemendprice();
        if (itemendprice != null) {
            stmt.bindString(6, itemendprice);
        }
 
        String itempic = entity.getItempic();
        if (itempic != null) {
            stmt.bindString(7, itempic);
        }
 
        String itemid = entity.getItemid();
        if (itemid != null) {
            stmt.bindString(8, itemid);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FootprintRzy entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String itemshorttitle = entity.getItemshorttitle();
        if (itemshorttitle != null) {
            stmt.bindString(2, itemshorttitle);
        }
 
        String itemprice = entity.getItemprice();
        if (itemprice != null) {
            stmt.bindString(3, itemprice);
        }
 
        String itemsale = entity.getItemsale();
        if (itemsale != null) {
            stmt.bindString(4, itemsale);
        }
 
        String couponmoney = entity.getCouponmoney();
        if (couponmoney != null) {
            stmt.bindString(5, couponmoney);
        }
 
        String itemendprice = entity.getItemendprice();
        if (itemendprice != null) {
            stmt.bindString(6, itemendprice);
        }
 
        String itempic = entity.getItempic();
        if (itempic != null) {
            stmt.bindString(7, itempic);
        }
 
        String itemid = entity.getItemid();
        if (itemid != null) {
            stmt.bindString(8, itemid);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FootprintRzy readEntity(Cursor cursor, int offset) {
        FootprintRzy entity = new FootprintRzy( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // itemshorttitle
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // itemprice
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // itemsale
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // couponmoney
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // itemendprice
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // itempic
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // itemid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FootprintRzy entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setItemshorttitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setItemprice(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setItemsale(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCouponmoney(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setItemendprice(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setItempic(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setItemid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FootprintRzy entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FootprintRzy entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FootprintRzy entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
