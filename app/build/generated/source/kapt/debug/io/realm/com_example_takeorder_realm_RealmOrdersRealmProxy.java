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
public class com_example_takeorder_realm_RealmOrdersRealmProxy extends com.example.takeorder.realm.RealmOrders
    implements RealmObjectProxy, com_example_takeorder_realm_RealmOrdersRealmProxyInterface {

    static final class RealmOrdersColumnInfo extends ColumnInfo {
        long idColKey;
        long total_priceColKey;
        long dateColKey;

        RealmOrdersColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmOrders");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.total_priceColKey = addColumnDetails("total_price", "total_price", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
            addBacklinkDetails(schemaInfo, "menuItemOrder", "RealmMenuItemsOrders", "order");
            addBacklinkDetails(schemaInfo, "staff", "RealmStaff", "orders");
        }

        RealmOrdersColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmOrdersColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmOrdersColumnInfo src = (RealmOrdersColumnInfo) rawSrc;
            final RealmOrdersColumnInfo dst = (RealmOrdersColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.total_priceColKey = src.total_priceColKey;
            dst.dateColKey = src.dateColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmOrdersColumnInfo columnInfo;
    private ProxyState<com.example.takeorder.realm.RealmOrders> proxyState;
    private RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> menuItemOrderBacklinks;
    private RealmResults<com.example.takeorder.realm.RealmStaff> staffBacklinks;

    com_example_takeorder_realm_RealmOrdersRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmOrdersColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.takeorder.realm.RealmOrders>(this);
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
    public long realmGet$total_price() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.total_priceColKey);
    }

    @Override
    public void realmSet$total_price(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.total_priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.total_priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dateColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.dateColKey);
    }

    @Override
    public void realmSet$date(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.dateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.dateColKey, value);
    }

    @Override
    public RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> realmGet$menuItemOrder() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (menuItemOrderBacklinks == null) {
            menuItemOrderBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), com.example.takeorder.realm.RealmMenuItemsOrders.class, "order");
        }
        return menuItemOrderBacklinks;
    }

    @Override
    public RealmResults<com.example.takeorder.realm.RealmStaff> realmGet$staff() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (staffBacklinks == null) {
            staffBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), com.example.takeorder.realm.RealmStaff.class, "orders");
        }
        return staffBacklinks;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmOrders", false, 3, 2);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "total_price", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "date", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addComputedLinkProperty("menuItemOrder", "RealmMenuItemsOrders", "order");
        builder.addComputedLinkProperty("staff", "RealmStaff", "orders");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmOrdersColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmOrdersColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmOrders";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmOrders";
    }

    @SuppressWarnings("cast")
    public static com.example.takeorder.realm.RealmOrders createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.takeorder.realm.RealmOrders obj = null;
        if (update) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
            RealmOrdersColumnInfo columnInfo = (RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmOrders.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmOrders.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_takeorder_realm_RealmOrdersRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) obj;
        if (json.has("total_price")) {
            if (json.isNull("total_price")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'total_price' to null.");
            } else {
                objProxy.realmSet$total_price((long) json.getLong("total_price"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                Object timestamp = json.get("date");
                if (timestamp instanceof String) {
                    objProxy.realmSet$date(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$date(new Date(json.getLong("date")));
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.takeorder.realm.RealmOrders createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.takeorder.realm.RealmOrders obj = new com.example.takeorder.realm.RealmOrders();
        final com_example_takeorder_realm_RealmOrdersRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) obj;
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
            } else if (name.equals("total_price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$total_price((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'total_price' to null.");
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$date(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$date(JsonUtils.stringToDate(reader.nextString()));
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

    static com_example_takeorder_realm_RealmOrdersRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class), false, Collections.<String>emptyList());
        io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy obj = new io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.takeorder.realm.RealmOrders copyOrUpdate(Realm realm, RealmOrdersColumnInfo columnInfo, com.example.takeorder.realm.RealmOrders object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.example.takeorder.realm.RealmOrders) cachedRealmObject;
        }

        com.example.takeorder.realm.RealmOrders realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.takeorder.realm.RealmOrders copy(Realm realm, RealmOrdersColumnInfo columnInfo, com.example.takeorder.realm.RealmOrders newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmOrders) cachedRealmObject;
        }

        com_example_takeorder_realm_RealmOrdersRealmProxyInterface unmanagedSource = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addInteger(columnInfo.total_priceColKey, unmanagedSource.realmGet$total_price());
        builder.addDate(columnInfo.dateColKey, unmanagedSource.realmGet$date());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_takeorder_realm_RealmOrdersRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.takeorder.realm.RealmOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmOrdersColumnInfo columnInfo = (RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.total_priceColKey, objKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$total_price(), false);
        java.util.Date realmGet$date = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmOrdersColumnInfo columnInfo = (RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmOrders object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.total_priceColKey, objKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$total_price(), false);
            java.util.Date realmGet$date = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.takeorder.realm.RealmOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmOrdersColumnInfo columnInfo = (RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.total_priceColKey, objKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$total_price(), false);
        java.util.Date realmGet$date = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmOrdersColumnInfo columnInfo = (RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmOrders object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.total_priceColKey, objKey, ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$total_price(), false);
            java.util.Date realmGet$date = ((com_example_takeorder_realm_RealmOrdersRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
            }
        }
    }

    public static com.example.takeorder.realm.RealmOrders createDetachedCopy(com.example.takeorder.realm.RealmOrders realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.takeorder.realm.RealmOrders unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.takeorder.realm.RealmOrders();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.takeorder.realm.RealmOrders) cachedObject.object;
            }
            unmanagedObject = (com.example.takeorder.realm.RealmOrders) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_takeorder_realm_RealmOrdersRealmProxyInterface unmanagedCopy = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) unmanagedObject;
        com_example_takeorder_realm_RealmOrdersRealmProxyInterface realmSource = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$total_price(realmSource.realmGet$total_price());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    static com.example.takeorder.realm.RealmOrders update(Realm realm, RealmOrdersColumnInfo columnInfo, com.example.takeorder.realm.RealmOrders realmObject, com.example.takeorder.realm.RealmOrders newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_takeorder_realm_RealmOrdersRealmProxyInterface realmObjectTarget = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) realmObject;
        com_example_takeorder_realm_RealmOrdersRealmProxyInterface realmObjectSource = (com_example_takeorder_realm_RealmOrdersRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.takeorder.realm.RealmOrders.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());
        builder.addDate(columnInfo.dateColKey, realmObjectSource.realmGet$date());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmOrders = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{total_price:");
        stringBuilder.append(realmGet$total_price());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
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
        com_example_takeorder_realm_RealmOrdersRealmProxy aRealmOrders = (com_example_takeorder_realm_RealmOrdersRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmOrders.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmOrders.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmOrders.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
