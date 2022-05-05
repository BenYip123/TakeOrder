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
public class com_example_takeorder_realm_RealmStaffRealmProxy extends com.example.takeorder.realm.RealmStaff
    implements RealmObjectProxy, com_example_takeorder_realm_RealmStaffRealmProxyInterface {

    static final class RealmStaffColumnInfo extends ColumnInfo {
        long idColKey;
        long nameColKey;
        long passwordColKey;
        long roleColKey;
        long ordersColKey;

        RealmStaffColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmStaff");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.passwordColKey = addColumnDetails("password", "password", objectSchemaInfo);
            this.roleColKey = addColumnDetails("role", "role", objectSchemaInfo);
            this.ordersColKey = addColumnDetails("orders", "orders", objectSchemaInfo);
        }

        RealmStaffColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmStaffColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmStaffColumnInfo src = (RealmStaffColumnInfo) rawSrc;
            final RealmStaffColumnInfo dst = (RealmStaffColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.nameColKey = src.nameColKey;
            dst.passwordColKey = src.passwordColKey;
            dst.roleColKey = src.roleColKey;
            dst.ordersColKey = src.ordersColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmStaffColumnInfo columnInfo;
    private ProxyState<com.example.takeorder.realm.RealmStaff> proxyState;
    private RealmList<com.example.takeorder.realm.RealmOrders> ordersRealmList;

    com_example_takeorder_realm_RealmStaffRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmStaffColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.takeorder.realm.RealmStaff>(this);
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
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordColKey);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'password' to null.");
            }
            row.getTable().setString(columnInfo.passwordColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'password' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.passwordColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$role() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.roleColKey);
    }

    @Override
    public void realmSet$role(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'role' to null.");
            }
            row.getTable().setString(columnInfo.roleColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'role' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.roleColKey, value);
    }

    @Override
    public RealmList<com.example.takeorder.realm.RealmOrders> realmGet$orders() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (ordersRealmList != null) {
            return ordersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.ordersColKey);
            ordersRealmList = new RealmList<com.example.takeorder.realm.RealmOrders>(com.example.takeorder.realm.RealmOrders.class, osList, proxyState.getRealm$realm());
            return ordersRealmList;
        }
    }

    @Override
    public void realmSet$orders(RealmList<com.example.takeorder.realm.RealmOrders> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("orders")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.example.takeorder.realm.RealmOrders> original = value;
                value = new RealmList<com.example.takeorder.realm.RealmOrders>();
                for (com.example.takeorder.realm.RealmOrders item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealmOrUpdate(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.ordersColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.takeorder.realm.RealmOrders linkedObject = value.get(i);
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
                com.example.takeorder.realm.RealmOrders linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmStaff", false, 5, 0);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "role", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "orders", RealmFieldType.LIST, "RealmOrders");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmStaffColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmStaffColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmStaff";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmStaff";
    }

    @SuppressWarnings("cast")
    public static com.example.takeorder.realm.RealmStaff createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.example.takeorder.realm.RealmStaff obj = null;
        if (update) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
            RealmStaffColumnInfo columnInfo = (RealmStaffColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_takeorder_realm_RealmStaffRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("orders")) {
                excludeFields.add("orders");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_takeorder_realm_RealmStaffRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmStaff.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_takeorder_realm_RealmStaffRealmProxy) realm.createObjectInternal(com.example.takeorder.realm.RealmStaff.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_takeorder_realm_RealmStaffRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("role")) {
            if (json.isNull("role")) {
                objProxy.realmSet$role(null);
            } else {
                objProxy.realmSet$role((String) json.getString("role"));
            }
        }
        if (json.has("orders")) {
            if (json.isNull("orders")) {
                objProxy.realmSet$orders(null);
            } else {
                objProxy.realmGet$orders().clear();
                JSONArray array = json.getJSONArray("orders");
                for (int i = 0; i < array.length(); i++) {
                    com.example.takeorder.realm.RealmOrders item = com_example_takeorder_realm_RealmOrdersRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$orders().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.takeorder.realm.RealmStaff createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.takeorder.realm.RealmStaff obj = new com.example.takeorder.realm.RealmStaff();
        final com_example_takeorder_realm_RealmStaffRealmProxyInterface objProxy = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) obj;
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
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else if (name.equals("role")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$role((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$role(null);
                }
            } else if (name.equals("orders")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$orders(null);
                } else {
                    objProxy.realmSet$orders(new RealmList<com.example.takeorder.realm.RealmOrders>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.example.takeorder.realm.RealmOrders item = com_example_takeorder_realm_RealmOrdersRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$orders().add(item);
                    }
                    reader.endArray();
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

    static com_example_takeorder_realm_RealmStaffRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class), false, Collections.<String>emptyList());
        io.realm.com_example_takeorder_realm_RealmStaffRealmProxy obj = new io.realm.com_example_takeorder_realm_RealmStaffRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.takeorder.realm.RealmStaff copyOrUpdate(Realm realm, RealmStaffColumnInfo columnInfo, com.example.takeorder.realm.RealmStaff object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.example.takeorder.realm.RealmStaff) cachedRealmObject;
        }

        com.example.takeorder.realm.RealmStaff realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_takeorder_realm_RealmStaffRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.takeorder.realm.RealmStaff copy(Realm realm, RealmStaffColumnInfo columnInfo, com.example.takeorder.realm.RealmStaff newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.takeorder.realm.RealmStaff) cachedRealmObject;
        }

        com_example_takeorder_realm_RealmStaffRealmProxyInterface unmanagedSource = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.passwordColKey, unmanagedSource.realmGet$password());
        builder.addString(columnInfo.roleColKey, unmanagedSource.realmGet$role());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_takeorder_realm_RealmStaffRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.example.takeorder.realm.RealmOrders> ordersUnmanagedList = unmanagedSource.realmGet$orders();
        if (ordersUnmanagedList != null) {
            RealmList<com.example.takeorder.realm.RealmOrders> ordersManagedList = managedCopy.realmGet$orders();
            ordersManagedList.clear();
            for (int i = 0; i < ordersUnmanagedList.size(); i++) {
                com.example.takeorder.realm.RealmOrders ordersUnmanagedItem = ordersUnmanagedList.get(i);
                com.example.takeorder.realm.RealmOrders cacheorders = (com.example.takeorder.realm.RealmOrders) cache.get(ordersUnmanagedItem);
                if (cacheorders != null) {
                    ordersManagedList.add(cacheorders);
                } else {
                    ordersManagedList.add(com_example_takeorder_realm_RealmOrdersRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmOrdersRealmProxy.RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class), ordersUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.takeorder.realm.RealmStaff object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        long tableNativePtr = table.getNativePtr();
        RealmStaffColumnInfo columnInfo = (RealmStaffColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$password = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        }
        String realmGet$role = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$role();
        if (realmGet$role != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
        }

        RealmList<com.example.takeorder.realm.RealmOrders> ordersList = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$orders();
        if (ordersList != null) {
            OsList ordersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.ordersColKey);
            for (com.example.takeorder.realm.RealmOrders ordersItem : ordersList) {
                Long cacheItemIndexorders = cache.get(ordersItem);
                if (cacheItemIndexorders == null) {
                    cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insert(realm, ordersItem, cache);
                }
                ordersOsList.addRow(cacheItemIndexorders);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        long tableNativePtr = table.getNativePtr();
        RealmStaffColumnInfo columnInfo = (RealmStaffColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmStaff object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmStaff) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$password = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            }
            String realmGet$role = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$role();
            if (realmGet$role != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
            }

            RealmList<com.example.takeorder.realm.RealmOrders> ordersList = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$orders();
            if (ordersList != null) {
                OsList ordersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.ordersColKey);
                for (com.example.takeorder.realm.RealmOrders ordersItem : ordersList) {
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insert(realm, ordersItem, cache);
                    }
                    ordersOsList.addRow(cacheItemIndexorders);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.takeorder.realm.RealmStaff object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        long tableNativePtr = table.getNativePtr();
        RealmStaffColumnInfo columnInfo = (RealmStaffColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$password = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
        }
        String realmGet$role = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$role();
        if (realmGet$role != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.roleColKey, objKey, false);
        }

        OsList ordersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.ordersColKey);
        RealmList<com.example.takeorder.realm.RealmOrders> ordersList = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$orders();
        if (ordersList != null && ordersList.size() == ordersOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = ordersList.size();
            for (int i = 0; i < objectCount; i++) {
                com.example.takeorder.realm.RealmOrders ordersItem = ordersList.get(i);
                Long cacheItemIndexorders = cache.get(ordersItem);
                if (cacheItemIndexorders == null) {
                    cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                }
                ordersOsList.setRow(i, cacheItemIndexorders);
            }
        } else {
            ordersOsList.removeAll();
            if (ordersList != null) {
                for (com.example.takeorder.realm.RealmOrders ordersItem : ordersList) {
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                    }
                    ordersOsList.addRow(cacheItemIndexorders);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        long tableNativePtr = table.getNativePtr();
        RealmStaffColumnInfo columnInfo = (RealmStaffColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmStaff.class);
        long pkColumnKey = columnInfo.idColKey;
        com.example.takeorder.realm.RealmStaff object = null;
        while (objects.hasNext()) {
            object = (com.example.takeorder.realm.RealmStaff) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$password = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
            }
            String realmGet$role = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$role();
            if (realmGet$role != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.roleColKey, objKey, false);
            }

            OsList ordersOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.ordersColKey);
            RealmList<com.example.takeorder.realm.RealmOrders> ordersList = ((com_example_takeorder_realm_RealmStaffRealmProxyInterface) object).realmGet$orders();
            if (ordersList != null && ordersList.size() == ordersOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = ordersList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.example.takeorder.realm.RealmOrders ordersItem = ordersList.get(i);
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                    }
                    ordersOsList.setRow(i, cacheItemIndexorders);
                }
            } else {
                ordersOsList.removeAll();
                if (ordersList != null) {
                    for (com.example.takeorder.realm.RealmOrders ordersItem : ordersList) {
                        Long cacheItemIndexorders = cache.get(ordersItem);
                        if (cacheItemIndexorders == null) {
                            cacheItemIndexorders = com_example_takeorder_realm_RealmOrdersRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                        }
                        ordersOsList.addRow(cacheItemIndexorders);
                    }
                }
            }

        }
    }

    public static com.example.takeorder.realm.RealmStaff createDetachedCopy(com.example.takeorder.realm.RealmStaff realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.takeorder.realm.RealmStaff unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.takeorder.realm.RealmStaff();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.takeorder.realm.RealmStaff) cachedObject.object;
            }
            unmanagedObject = (com.example.takeorder.realm.RealmStaff) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_takeorder_realm_RealmStaffRealmProxyInterface unmanagedCopy = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) unmanagedObject;
        com_example_takeorder_realm_RealmStaffRealmProxyInterface realmSource = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());
        unmanagedCopy.realmSet$role(realmSource.realmGet$role());

        // Deep copy of orders
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$orders(null);
        } else {
            RealmList<com.example.takeorder.realm.RealmOrders> managedordersList = realmSource.realmGet$orders();
            RealmList<com.example.takeorder.realm.RealmOrders> unmanagedordersList = new RealmList<com.example.takeorder.realm.RealmOrders>();
            unmanagedCopy.realmSet$orders(unmanagedordersList);
            int nextDepth = currentDepth + 1;
            int size = managedordersList.size();
            for (int i = 0; i < size; i++) {
                com.example.takeorder.realm.RealmOrders item = com_example_takeorder_realm_RealmOrdersRealmProxy.createDetachedCopy(managedordersList.get(i), nextDepth, maxDepth, cache);
                unmanagedordersList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.example.takeorder.realm.RealmStaff update(Realm realm, RealmStaffColumnInfo columnInfo, com.example.takeorder.realm.RealmStaff realmObject, com.example.takeorder.realm.RealmStaff newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_takeorder_realm_RealmStaffRealmProxyInterface realmObjectTarget = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) realmObject;
        com_example_takeorder_realm_RealmStaffRealmProxyInterface realmObjectSource = (com_example_takeorder_realm_RealmStaffRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.takeorder.realm.RealmStaff.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.roleColKey, realmObjectSource.realmGet$role());

        RealmList<com.example.takeorder.realm.RealmOrders> ordersUnmanagedList = realmObjectSource.realmGet$orders();
        if (ordersUnmanagedList != null) {
            RealmList<com.example.takeorder.realm.RealmOrders> ordersManagedCopy = new RealmList<com.example.takeorder.realm.RealmOrders>();
            for (int i = 0; i < ordersUnmanagedList.size(); i++) {
                com.example.takeorder.realm.RealmOrders ordersItem = ordersUnmanagedList.get(i);
                com.example.takeorder.realm.RealmOrders cacheorders = (com.example.takeorder.realm.RealmOrders) cache.get(ordersItem);
                if (cacheorders != null) {
                    ordersManagedCopy.add(cacheorders);
                } else {
                    ordersManagedCopy.add(com_example_takeorder_realm_RealmOrdersRealmProxy.copyOrUpdate(realm, (com_example_takeorder_realm_RealmOrdersRealmProxy.RealmOrdersColumnInfo) realm.getSchema().getColumnInfo(com.example.takeorder.realm.RealmOrders.class), ordersItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.ordersColKey, ordersManagedCopy);
        } else {
            builder.addObjectList(columnInfo.ordersColKey, new RealmList<com.example.takeorder.realm.RealmOrders>());
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
        StringBuilder stringBuilder = new StringBuilder("RealmStaff = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{role:");
        stringBuilder.append(realmGet$role());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orders:");
        stringBuilder.append("RealmList<RealmOrders>[").append(realmGet$orders().size()).append("]");
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
        com_example_takeorder_realm_RealmStaffRealmProxy aRealmStaff = (com_example_takeorder_realm_RealmStaffRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmStaff.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmStaff.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmStaff.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
