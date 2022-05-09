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
public class com_example_takeorder_realm_RealmMenuCategoryRealmProxy extends com.example.takeorder.realm.RealmMenuCategory
    implements RealmObjectProxy, com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface {

    static final class RealmMenuCategoryColumnInfo extends ColumnInfo {
        long categoryColKey;
        long itemsColKey;

        RealmMenuCategoryColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmMenuCategory");
            this.categoryColKey = addColumnDetails("category", "category", objectSchemaInfo);
            this.itemsColKey = addColumnDetails("items", "items", objectSchemaInfo);
        }

        RealmMenuCategoryColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmMenuCategoryColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmMenuCategoryColumnInfo src = (RealmMenuCategoryColumnInfo) rawSrc;
            final RealmMenuCategoryColumnInfo dst = (RealmMenuCategoryColumnInfo) rawDst;
            dst.categoryColKey = src.categoryColKey;
            dst.itemsColKey = src.itemsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmMenuCategoryColumnInfo columnInfo;
    private ProxyState<com.example.takeorder.realm.RealmMenuCategory> proxyState;
    private RealmList<com.example.takeorder.realm.RealmMenuItems> itemsRealmList;

    com_example_takeorder_realm_RealmMenuCategoryRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmMenuCategoryColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.takeorder.realm.RealmMenuCategory>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'category' cannot be changed after object was created.");
    }

    @Override
    public RealmList<com.example.takeorder.realm.RealmMenuItems> realmGet$items() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (itemsRealmList != null) {
            return itemsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemsColKey);
            itemsRealmList = new RealmList<com.example.takeorder.realm.RealmMenuItems>(com.example.takeorder.realm.RealmMenuItems.class, osList, proxyState.getRealm$realm());
            return itemsRealmList;
        }
    }

    @Override
    public void realmSet$items(RealmList<com.example.takeorder.realm.RealmMenuItems> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("items")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.example.takeorder.realm.RealmMenuItems> original = value;
                value = new RealmList<com.example.takeorder.realm.RealmMenuItems>();
                for (com.example.takeorder.realm.RealmMenuItems item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.itemsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.takeorder.realm.RealmMenuItems linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.takeorder.realm.RealmMenuItems linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmMenuCategory", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "category", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "items", RealmFieldType.LIST, "RealmMenuItems");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmMenuCategoryColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmMenuCategoryColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmMenuCategory";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmMenuCategory";
    }

    @SuppressWarnings("cast")
    public static com.example.takeorder.realm.RealmMenuCategory createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.example.takeorder.realm.RealmMenuCategory obj = null;
        if (update) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
            RealmMenuCategoryColumnInfo columnInfo = (RealmMenuCategoryColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class);
            long pkColumnKey = columnInfo.categoryColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("category")) {
                objKey = table.findFirstString(pkColumnKey, json.getString("category"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("items")) {
                excludeFields.add("items");
            }
            if (json.has("category")) {
                if (json.isNull("category")) {
                    obj = (io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmMenuCategory.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmMenuCategory.class, json.getString("category"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'category'.");
            }
        }

        final com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) obj;
        if (json.has("items")) {
            if (json.isNull("items")) {
                objProxy.realmSet$items(null);
            } else {
                objProxy.realmGet$items().clear();
                JSONArray array = json.getJSONArray("items");
                for (int i = 0; i < array.length(); i++) {
                    com.example.takeorder.realm.RealmMenuItems item = com_example_takeorder_realm_RealmMenuItemsRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$items().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.takeorder.realm.RealmMenuCategory createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.takeorder.realm.RealmMenuCategory obj = new com.example.takeorder.realm.RealmMenuCategory();
        final com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("category")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("items")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$items(null);
                } else {
                    objProxy.realmSet$items(new RealmList<com.example.takeorder.realm.RealmMenuItems>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.example.takeorder.realm.RealmMenuItems item = com_example_takeorder_realm_RealmMenuItemsRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$items().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'category'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_example_takeorder_realm_RealmMenuCategoryRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class), false, Collections.<String>emptyList());
        io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy obj = new io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.takeorder.realm.RealmMenuCategory copyOrUpdate(Realm realm, RealmMenuCategoryColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuCategory object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.example.takeorder.realm.RealmMenuCategory) cachedRealmObject;
        }

        com.example.takeorder.realm.RealmMenuCategory realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
            long pkColumnKey = columnInfo.categoryColKey;
            long objKey = table.findFirstString(pkColumnKey, ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$category());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.takeorder.realm.RealmMenuCategory copy(Realm realm, RealmMenuCategoryColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuCategory newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmMenuCategory) cachedRealmObject;
        }

        com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface unmanagedSource = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.categoryColKey, unmanagedSource.realmGet$category());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_takeorder_realm_RealmMenuCategoryRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.example.takeorder.realm.RealmMenuItems> itemsUnmanagedList = unmanagedSource.realmGet$items();
        if (itemsUnmanagedList != null) {
            RealmList<com.example.takeorder.realm.RealmMenuItems> itemsManagedList = managedCopy.realmGet$items();
            itemsManagedList.clear();
            for (int i = 0; i < itemsUnmanagedList.size(); i++) {
                com.example.takeorder.realm.RealmMenuItems itemsUnmanagedItem = itemsUnmanagedList.get(i);
                com.example.takeorder.realm.RealmMenuItems cacheitems = (com.example.takeorder.realm.RealmMenuItems) cache.get(itemsUnmanagedItem);
                if (cacheitems != null) {
                    itemsManagedList.add(cacheitems);
                } else {
                    itemsManagedList.add(com_example_takeorder_realm_RealmMenuItemsRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmMenuItemsRealmProxy.RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class), itemsUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.takeorder.realm.RealmMenuCategory object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuCategoryColumnInfo columnInfo = (RealmMenuCategoryColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class);
        long pkColumnKey = columnInfo.categoryColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$category();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);

        RealmList<com.example.takeorder.realm.RealmMenuItems> itemsList = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$items();
        if (itemsList != null) {
            OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
            for (com.example.takeorder.realm.RealmMenuItems itemsItem : itemsList) {
                Long cacheItemIndexitems = cache.get(itemsItem);
                if (cacheItemIndexitems == null) {
                    cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insert(realm, itemsItem, cache);
                }
                itemsOsList.addRow(cacheItemIndexitems);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuCategoryColumnInfo columnInfo = (RealmMenuCategoryColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class);
        long pkColumnKey = columnInfo.categoryColKey;
        com.example.takeorder.realm.RealmMenuCategory object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuCategory) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$category();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);

            RealmList<com.example.takeorder.realm.RealmMenuItems> itemsList = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$items();
            if (itemsList != null) {
                OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
                for (com.example.takeorder.realm.RealmMenuItems itemsItem : itemsList) {
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insert(realm, itemsItem, cache);
                    }
                    itemsOsList.addRow(cacheItemIndexitems);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.takeorder.realm.RealmMenuCategory object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuCategoryColumnInfo columnInfo = (RealmMenuCategoryColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class);
        long pkColumnKey = columnInfo.categoryColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$category();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);

        OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
        RealmList<com.example.takeorder.realm.RealmMenuItems> itemsList = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$items();
        if (itemsList != null && itemsList.size() == itemsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = itemsList.size();
            for (int i = 0; i < objectCount; i++) {
                com.example.takeorder.realm.RealmMenuItems itemsItem = itemsList.get(i);
                Long cacheItemIndexitems = cache.get(itemsItem);
                if (cacheItemIndexitems == null) {
                    cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                }
                itemsOsList.setRow(i, cacheItemIndexitems);
            }
        } else {
            itemsOsList.removeAll();
            if (itemsList != null) {
                for (com.example.takeorder.realm.RealmMenuItems itemsItem : itemsList) {
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                    }
                    itemsOsList.addRow(cacheItemIndexitems);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        long tableNativePtr = table.getNativePtr();
        RealmMenuCategoryColumnInfo columnInfo = (RealmMenuCategoryColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuCategory.class);
        long pkColumnKey = columnInfo.categoryColKey;
        com.example.takeorder.realm.RealmMenuCategory object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmMenuCategory) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$category();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);

            OsList itemsOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.itemsColKey);
            RealmList<com.example.takeorder.realm.RealmMenuItems> itemsList = ((com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) object).realmGet$items();
            if (itemsList != null && itemsList.size() == itemsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = itemsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.example.takeorder.realm.RealmMenuItems itemsItem = itemsList.get(i);
                    Long cacheItemIndexitems = cache.get(itemsItem);
                    if (cacheItemIndexitems == null) {
                        cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                    }
                    itemsOsList.setRow(i, cacheItemIndexitems);
                }
            } else {
                itemsOsList.removeAll();
                if (itemsList != null) {
                    for (com.example.takeorder.realm.RealmMenuItems itemsItem : itemsList) {
                        Long cacheItemIndexitems = cache.get(itemsItem);
                        if (cacheItemIndexitems == null) {
                            cacheItemIndexitems = com_example_takeorder_realm_RealmMenuItemsRealmProxy.insertOrUpdate(realm, itemsItem, cache);
                        }
                        itemsOsList.addRow(cacheItemIndexitems);
                    }
                }
            }

        }
    }

    public static com.example.takeorder.realm.RealmMenuCategory createDetachedCopy(com.example.takeorder.realm.RealmMenuCategory realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.takeorder.realm.RealmMenuCategory unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.takeorder.realm.RealmMenuCategory();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.takeorder.realm.RealmMenuCategory) cachedObject.object;
            }
            unmanagedObject = (com.example.takeorder.realm.RealmMenuCategory) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface unmanagedCopy = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) unmanagedObject;
        com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface realmSource = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$category(realmSource.realmGet$category());

        // Deep copy of items
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$items(null);
        } else {
            RealmList<com.example.takeorder.realm.RealmMenuItems> manageditemsList = realmSource.realmGet$items();
            RealmList<com.example.takeorder.realm.RealmMenuItems> unmanageditemsList = new RealmList<com.example.takeorder.realm.RealmMenuItems>();
            unmanagedCopy.realmSet$items(unmanageditemsList);
            int nextDepth = currentDepth + 1;
            int size = manageditemsList.size();
            for (int i = 0; i < size; i++) {
                com.example.takeorder.realm.RealmMenuItems item = com_example_takeorder_realm_RealmMenuItemsRealmProxy.createDetachedCopy(manageditemsList.get(i), nextDepth, maxDepth, cache);
                unmanageditemsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.example.takeorder.realm.RealmMenuCategory update(Realm realm, RealmMenuCategoryColumnInfo columnInfo, com.example.takeorder.realm.RealmMenuCategory realmObject, com.example.takeorder.realm.RealmMenuCategory newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface realmObjectTarget = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) realmObject;
        com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface realmObjectSource = (com_example_takeorder_realm_RealmMenuCategoryRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.takeorder.realm.RealmMenuCategory.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.categoryColKey, realmObjectSource.realmGet$category());

        RealmList<com.example.takeorder.realm.RealmMenuItems> itemsUnmanagedList = realmObjectSource.realmGet$items();
        if (itemsUnmanagedList != null) {
            RealmList<com.example.takeorder.realm.RealmMenuItems> itemsManagedCopy = new RealmList<com.example.takeorder.realm.RealmMenuItems>();
            for (int i = 0; i < itemsUnmanagedList.size(); i++) {
                com.example.takeorder.realm.RealmMenuItems itemsItem = itemsUnmanagedList.get(i);
                com.example.takeorder.realm.RealmMenuItems cacheitems = (com.example.takeorder.realm.RealmMenuItems) cache.get(itemsItem);
                if (cacheitems != null) {
                    itemsManagedCopy.add(cacheitems);
                } else {
                    itemsManagedCopy.add(com_example_takeorder_realm_RealmMenuItemsRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmMenuItemsRealmProxy.RealmMenuItemsColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmMenuItems.class), itemsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.itemsColKey, itemsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.itemsColKey, new RealmList<com.example.takeorder.realm.RealmMenuItems>());
        }

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmMenuCategory = proxy[");
        stringBuilder.append("{category:");
        stringBuilder.append(realmGet$category());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{items:");
        stringBuilder.append("RealmList<RealmMenuItems>[").append(realmGet$items().size()).append("]");
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
        com_example_takeorder_realm_RealmMenuCategoryRealmProxy aRealmMenuCategory = (com_example_takeorder_realm_RealmMenuCategoryRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmMenuCategory.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmMenuCategory.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmMenuCategory.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
