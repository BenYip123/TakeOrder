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
public class com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy extends com.example.takeorder.realm.RealmMenuItemsOrders
    implements RealmObjectProxy, com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface {

    static final class RealmMenuItemsOrdersColumnInfo extends ColumnInfo {
        long menuItemColKey;
        long orderColKey;
        long quantityColKey;

        RealmMenuItemsOrdersColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmMenuItemsOrders");
            this.menuItemColKey = addColumnDetails("menuItem", "menuItem", objectSchemaInfo);
            this.orderColKey = addColumnDetails("order", "order", objectSchemaInfo);
            this.quantityColKey = addColumnDetails("quantity", "quantity", objectSchemaInfo);
        }

        RealmMenuItemsOrdersColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmMenuItemsOrdersColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmMenuItemsOrdersColumnInfo src = (RealmMenuItemsOrdersColumnInfo) rawSrc;
            final RealmMenuItemsOrdersColumnInfo dst = (RealmMenuItemsOrdersColumnInfo) rawDst;
            dst.menuItemColKey = src.menuItemColKey;
            dst.orderColKey = src.orderColKey;
            dst.quantityColKey = src.quantityColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmMenuItemsOrdersColumnInfo columnInfo;
    private ProxyState<com.example.takeorder.realm.RealmMenuItemsOrders> proxyState;

    com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmMenuItemsOrdersColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.takeorder.realm.RealmMenuItemsOrders>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public com.example.takeorder.realm.RealmMenuItems realmGet$menuItem() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.menuItemColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.takeorder.realm.RealmMenuItems.class, proxyState.getRow$realm().getLink(columnInfo.menuItemColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$menuItem(com.example.takeorder.realm.RealmMenuItems value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("menuItem")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealmOrUpdate(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.menuItemColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.menuItemColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.menuItemColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.menuItemColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    public com.example.takeorder.realm.RealmOrders realmGet$order() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.orderColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.takeorder.realm.RealmOrders.class, proxyState.getRow$realm().getLink(columnInfo.orderColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$order(com.example.takeorder.realm.RealmOrders value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("order")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealmOrUpdate(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.orderColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.orderColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.orderColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.orderColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$quantity() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.quantityColKey);
    }

    @Override
    public void realmSet$quantity(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.quantityColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.quantityColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmMenuItemsOrders", false, 3, 0);
        builder.addPersistedLinkProperty(NO_ALIAS, "menuItem", RealmFieldType.OBJECT, "RealmMenuItems");
        builder.addPersistedLinkProperty(NO_ALIAS, "order", RealmFieldType.OBJECT, "RealmOrders");
        builder.addPersistedProperty(NO_ALIAS, "quantity", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmMenuItemsOrdersColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmMenuItemsOrdersColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmMenuItemsOrders";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmMenuItemsOrders";
    }

    @SuppressWarnings("cast")
    public static com.example.takeorder.realm.RealmMenuItemsOrders createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("menuItem")) {
            excludeFields.add("menuItem");
        }
        if (json.has("order")) {
            excludeFields.add("order");
        }
        com.example.takeorder.realm.RealmMenuItemsOrders obj = realm.createObjectInternal(com.example.takeorder.realm.RealmMenuItemsOrders.class, true, excludeFields);

        final com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) obj;
        if (json.has("menuItem")) {
            if (json.isNull("menuItem")) {
                objProxy.realmSet$menuItem(null);
            } else {
                com.example.takeorder.realm.RealmMenuItems menuItemObj = com_example_takeorder_realm_RealmMenuItemsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("menuItem"), update);
                objProxy.realmSet$menuItem(menuItemObj);
            }
        }
        if (json.has("order")) {
            if (json.isNull("order")) {
                objProxy.realmSet$order(null);
            } else {
                com.example.takeorder.realm.RealmOrders orderObj = com_example_takeorder_realm_RealmOrdersRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("order"), update);
                objProxy.realmSet$order(orderObj);
            }
        }
        if (json.has("quantity")) {
            if (json.isNull("quantity")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'quantity' to null.");
            } else {
                objProxy.realmSet$quantity((int) json.getInt("quantity"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.takeorder.realm.RealmMenuItemsOrders createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.takeorder.realm.RealmMenuItemsOrders obj = new com.example.takeorder.realm.RealmMenuItemsOrders();
        final com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuItem")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$menuItem(null);
                } else {
                    com.example.takeorder.realm.RealmMenuItems menuItemObj = com_example_takeorder_realm_RealmMenuItemsRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$menuItem(menuItemObj);
                }
            } else if (name.equals("order")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$order(null);
                } else {
                    com.example.takeorder.realm.RealmOrders orderObj = com_example_takeorder_realm_RealmOrdersRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$order(orderObj);
                }
            } else if (name.equals("quantity")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$quantity((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'quantity' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItemsOrders.class), false, Collections.<String>emptyList());
        io.realm.com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy obj = new io.realm.com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.takeorder.realm.RealmMenuItemsOrders copyOrUpdate(Realm realm, RealmMenuItemsOrdersColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuItemsOrders object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.example.takeorder.realm.RealmMenuItemsOrders) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.takeorder.realm.RealmMenuItemsOrders copy(Realm realm, RealmMenuItemsOrdersColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuItemsOrders newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmMenuItemsOrders) cachedRealmObject;
        }

        com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface unmanagedSource = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.quantityColKey, unmanagedSource.realmGet$quantity());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.example.takeorder.realm.RealmMenuItems menuItemObj = unmanagedSource.realmGet$menuItem();
        if (menuItemObj == null) {
            managedCopy.realmSet$menuItem(null);
        } else {
            com.example.takeorder.realm.RealmMenuItems cachemenuItem = (com.example.takeorder.realm.RealmMenuItems) cache.get(menuItemObj);
            if (cachemenuItem != null) {
                managedCopy.realmSet$menuItem(cachemenuItem);
            } else {
                managedCopy.realmSet$menuItem(com_example_takeorder_realm_RealmMenuItemsRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmMenuItemsRealmProxy.RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class), menuItemObj, update, cache, flags));
            }
        }

        com.example.takeorder.realm.RealmOrders orderObj = unmanagedSource.realmGet$order();
        if (orderObj == null) {
            managedCopy.realmSet$order(null);
        } else {
            com.example.takeorder.realm.RealmOrders cacheorder = (com.example.takeorder.realm.RealmOrders) cache.get(orderObj);
            if (cacheorder != null) {
                managedCopy.realmSet$order(cacheorder);
            } else {
                managedCopy.realmSet$order(com_example_takeorder_realm_RealmOrdersRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmOrdersRealmProxy.RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class), orderObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.takeorder.realm.RealmMenuItemsOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsOrdersColumnInfo columnInfo = (RealmMenuItemsOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);

        com.example.takeorder.realm.RealmMenuItems menuItemObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$menuItem();
        if (menuItemObj != null) {
            Long cachemenuItem = cache.get(menuItemObj);
            if (cachemenuItem == null) {
                cachemenuItem = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insert(realm, menuItemObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.menuItemColKey, objKey, cachemenuItem, false);
        }

        com.example.takeorder.realm.RealmOrders orderObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$order();
        if (orderObj != null) {
            Long cacheorder = cache.get(orderObj);
            if (cacheorder == null) {
                cacheorder = com_example_takeorder_realm_RealmOrdersRealmProxy.insert(realm, orderObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.orderColKey, objKey, cacheorder, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.quantityColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$quantity(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsOrdersColumnInfo columnInfo = (RealmMenuItemsOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        com.example.takeorder.realm.RealmMenuItemsOrders object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuItemsOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);

            com.example.takeorder.realm.RealmMenuItems menuItemObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$menuItem();
            if (menuItemObj != null) {
                Long cachemenuItem = cache.get(menuItemObj);
                if (cachemenuItem == null) {
                    cachemenuItem = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insert(realm, menuItemObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.menuItemColKey, objKey, cachemenuItem, false);
            }

            com.example.takeorder.realm.RealmOrders orderObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$order();
            if (orderObj != null) {
                Long cacheorder = cache.get(orderObj);
                if (cacheorder == null) {
                    cacheorder = com_example_takeorder_realm_RealmOrdersRealmProxy.insert(realm, orderObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.orderColKey, objKey, cacheorder, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$quantity(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.takeorder.realm.RealmMenuItemsOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsOrdersColumnInfo columnInfo = (RealmMenuItemsOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);

        com.example.takeorder.realm.RealmMenuItems menuItemObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$menuItem();
        if (menuItemObj != null) {
            Long cachemenuItem = cache.get(menuItemObj);
            if (cachemenuItem == null) {
                cachemenuItem = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, menuItemObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.menuItemColKey, objKey, cachemenuItem, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.menuItemColKey, objKey);
        }

        com.example.takeorder.realm.RealmOrders orderObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$order();
        if (orderObj != null) {
            Long cacheorder = cache.get(orderObj);
            if (cacheorder == null) {
                cacheorder = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, orderObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.orderColKey, objKey, cacheorder, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.orderColKey, objKey);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.quantityColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$quantity(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuItemsOrdersColumnInfo columnInfo = (RealmMenuItemsOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItemsOrders.class);
        com.example.takeorder.realm.RealmMenuItemsOrders object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuItemsOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);

            com.example.takeorder.realm.RealmMenuItems menuItemObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$menuItem();
            if (menuItemObj != null) {
                Long cachemenuItem = cache.get(menuItemObj);
                if (cachemenuItem == null) {
                    cachemenuItem = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, menuItemObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.menuItemColKey, objKey, cachemenuItem, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.menuItemColKey, objKey);
            }

            com.example.takeorder.realm.RealmOrders orderObj = ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$order();
            if (orderObj != null) {
                Long cacheorder = cache.get(orderObj);
                if (cacheorder == null) {
                    cacheorder = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, orderObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.orderColKey, objKey, cacheorder, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.orderColKey, objKey);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityColKey, objKey, ((com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) object).realmGet$quantity(), false);
        }
    }

    public static com.example.takeorder.realm.RealmMenuItemsOrders createDetachedCopy(com.example.takeorder.realm.RealmMenuItemsOrders realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.takeorder.realm.RealmMenuItemsOrders unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.takeorder.realm.RealmMenuItemsOrders();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.takeorder.realm.RealmMenuItemsOrders) cachedObject.object;
            }
            unmanagedObject = (com.example.takeorder.realm.RealmMenuItemsOrders) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface unmanagedCopy = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) unmanagedObject;
        com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface realmSource = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();

        // Deep copy of menuItem
        unmanagedCopy.realmSet$menuItem(com_example_takeorder_realm_RealmMenuItemsRealmProxy.createDetachedCopy(realmSource.realmGet$menuItem(), currentDepth + 1, maxDepth, cache));

        // Deep copy of order
        unmanagedCopy.realmSet$order(com_example_takeorder_realm_RealmOrdersRealmProxy.createDetachedCopy(realmSource.realmGet$order(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$quantity(realmSource.realmGet$quantity());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmMenuItemsOrders = proxy[");
        stringBuilder.append("{menuItem:");
        stringBuilder.append(realmGet$menuItem() != null ? "RealmMenuItems" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{order:");
        stringBuilder.append(realmGet$order() != null ? "RealmOrders" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{quantity:");
        stringBuilder.append(realmGet$quantity());
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
        com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy aRealmMenuItemsOrders = (com_example_takeorder_realm_RealmMenuItemsOrdersRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmMenuItemsOrders.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmMenuItemsOrders.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmMenuItemsOrders.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
