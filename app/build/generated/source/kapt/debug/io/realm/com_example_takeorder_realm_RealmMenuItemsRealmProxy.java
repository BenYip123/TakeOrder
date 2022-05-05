package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_takeorder_realm_RealmMenuItemsRealmProxy extends com.example.takeorder.realm.RealmMenuItems
    implements RealmObjectProxy, com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface {

    static final class RealmMenuItemsColumnInfo extends ColumnInfo {
        long idColKey;
        long nameColKey;
        long priceColKey;
        long descriptionColKey;
        long categoryColKey;

        RealmMenuItemsColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmMenuItems");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.priceColKey = addColumnDetails("price", "price", objectSchemaInfo);
            this.descriptionColKey = addColumnDetails("description", "description", objectSchemaInfo);
            this.categoryColKey = addColumnDetails("category", "category", objectSchemaInfo);
            addBacklinkDetails(schemaInfo, "itemOrder", "RealmMenuItemsOrders", "menuItem");
        }

        RealmMenuItemsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmMenuItemsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmMenuItemsColumnInfo src = (RealmMenuItemsColumnInfo) rawSrc;
            final RealmMenuItemsColumnInfo dst = (RealmMenuItemsColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.nameColKey = src.nameColKey;
            dst.priceColKey = src.priceColKey;
            dst.descriptionColKey = src.descriptionColKey;
            dst.categoryColKey = src.categoryColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmMenuItemsColumnInfo columnInfo;
    private ProxyState<com.example.takeorder.realm.RealmMenuItems> proxyState;
    private RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> itemOrderBacklinks;

    com_example_takeorder_realm_RealmMenuItemsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmMenuItemsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.takeorder.realm.RealmMenuItems>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.priceColKey);
    }

    @Override
    public void realmSet$price(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionColKey);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
            }
            row.getTable().setString(columnInfo.descriptionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.categoryColKey);
    }

    @Override
    public void realmSet$category(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
            }
            row.getTable().setString(columnInfo.categoryColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.categoryColKey, value);
    }

    @Override
    public RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> realmGet$itemOrder() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (itemOrderBacklinks == null) {
            itemOrderBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), com.example.takeorder.realm.RealmMenuItemsOrders.class, "menuItem");
        }
        return itemOrderBacklinks;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmMenuItems", false, 5, 1);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "price", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "category", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addComputedLinkProperty("itemOrder", "RealmMenuItemsOrders", "menuItem");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmMenuItemsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmMenuItemsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmMenuItems";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmMenuItems";
    }

    @SuppressWarnings("cast")
    public static com.example.takeorder.realm.RealmMenuItems createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.takeorder.realm.RealmMenuItems obj = null;
        if (update) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
            RealmMenuItemsColumnInfo columnInfo = (RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmMenuItems.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmMenuItems.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
            } else {
                objProxy.realmSet$price((long) json.getLong("price"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                objProxy.realmSet$description(null);
            } else {
                objProxy.realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("category")) {
            if (json.isNull("category")) {
                objProxy.realmSet$category(null);
            } else {
                objProxy.realmSet$category((String) json.getString("category"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.takeorder.realm.RealmMenuItems createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.takeorder.realm.RealmMenuItems obj = new com.example.takeorder.realm.RealmMenuItems();
        final com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
                }
            } else if (name.equals("description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$description(null);
                }
            } else if (name.equals("category")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_example_takeorder_realm_RealmMenuItemsRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class), false, Collections.<String>emptyList());
        io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy obj = new io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.takeorder.realm.RealmMenuItems copyOrUpdate(Realm realm, RealmMenuItemsColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuItems object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmMenuItems) cachedRealmObject;
        }

        com.example.takeorder.realm.RealmMenuItems realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.takeorder.realm.RealmMenuItems copy(Realm realm, RealmMenuItemsColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuItems newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmMenuItems) cachedRealmObject;
        }

        com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface unmanagedSource = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addInteger(columnInfo.priceColKey, unmanagedSource.realmGet$price());
        builder.addString(columnInfo.descriptionColKey, unmanagedSource.realmGet$description());
        builder.addString(columnInfo.categoryColKey, unmanagedSource.realmGet$category());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_takeorder_realm_RealmMenuItemsRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.takeorder.realm.RealmMenuItems object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsColumnInfo columnInfo = (RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$price(), false);
        String realmGet$description = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
        }
        String realmGet$category = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsColumnInfo columnInfo = (RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmMenuItems object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuItems) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$price(), false);
            String realmGet$description = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
            }
            String realmGet$category = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$category();
            if (realmGet$category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.takeorder.realm.RealmMenuItems object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsColumnInfo columnInfo = (RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$price(), false);
        String realmGet$description = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, objKey, false);
        }
        String realmGet$category = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.categoryColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsColumnInfo columnInfo = (RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmMenuItems object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuItems) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$price(), false);
            String realmGet$description = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, objKey, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, objKey, false);
            }
            String realmGet$category = ((com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) object).realmGet$category();
            if (realmGet$category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.categoryColKey, objKey, realmGet$category, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.categoryColKey, objKey, false);
            }
        }
    }

    public static com.example.takeorder.realm.RealmMenuItems createDetachedCopy(com.example.takeorder.realm.RealmMenuItems realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.takeorder.realm.RealmMenuItems unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.takeorder.realm.RealmMenuItems();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.takeorder.realm.RealmMenuItems) cachedObject.object;
            }
            unmanagedObject = (com.example.takeorder.realm.RealmMenuItems) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface unmanagedCopy = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) unmanagedObject;
        com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface realmSource = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());
        unmanagedCopy.realmSet$category(realmSource.realmGet$category());

        return unmanagedObject;
    }

    static com.example.takeorder.realm.RealmMenuItems update(Realm realm, RealmMenuItemsColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuItems realmObject, com.example.takeorder.realm.RealmMenuItems newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface realmObjectTarget = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) realmObject;
        com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface realmObjectSource = (com_example_takeorder_realm_RealmMenuItemsRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItems.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.priceColKey, realmObjectSource.realmGet$price());
        builder.addString(columnInfo.descriptionColKey, realmObjectSource.realmGet$description());
        builder.addString(columnInfo.categoryColKey, realmObjectSource.realmGet$category());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmMenuItems = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{category:");
        stringBuilder.append(realmGet$category());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_takeorder_realm_RealmMenuItemsRealmProxy aRealmMenuItems = (com_example_takeorder_realm_RealmMenuItemsRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmMenuItems.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmMenuItems.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmMenuItems.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
