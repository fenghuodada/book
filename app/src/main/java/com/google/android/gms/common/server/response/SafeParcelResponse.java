package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField(getter = "getVersionCode", m4842id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getParcel", m4845id = 2)
    private final Parcel zab;
    private final int zac;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", m4845id = 3)
    private final zan zad;
    @Nullable
    private final String zae;
    private int zaf;
    private int zag;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) Parcel parcel, @SafeParcelable.Param(m4844id = 3) zan zanVar) {
        this.zaa = i;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel obtain = Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    @NonNull
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(@NonNull T t) {
        zan zanVar = new zan(t.getClass());
        zaF(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t, zanVar, (String) Preconditions.checkNotNull(t.getClass().getCanonicalName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        for (String str : fieldMappings.keySet()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(str);
            Class<? extends FastJsonResponse> cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, cls2.newInstance());
                } catch (IllegalAccessException e) {
                    String valueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Could not access object of type ".concat(valueOf) : new String("Could not access object of type "), e);
                } catch (InstantiationException e2) {
                    String valueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                    throw new IllegalStateException(valueOf2.length() != 0 ? "Could not instantiate an object of type ".concat(valueOf2) : new String("Could not instantiate an object of type "), e2);
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field<?, ?> field) {
        if (field.zaf == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.zaf;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
            return;
        }
        this.zag = SafeParcelWriter.beginObjectHeader(parcel);
        this.zaf = 1;
    }

    private final void zaH(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        Object createBigInteger;
        String escapeString;
        String str;
        Object valueOf;
        Object zaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(readHeader));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.zaj()) {
                    int i = field.zac;
                    switch (i) {
                        case 0:
                            valueOf = Integer.valueOf(SafeParcelReader.readInt(parcel, readHeader));
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 1:
                            valueOf = SafeParcelReader.createBigInteger(parcel, readHeader);
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 2:
                            valueOf = Long.valueOf(SafeParcelReader.readLong(parcel, readHeader));
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 3:
                            valueOf = Float.valueOf(SafeParcelReader.readFloat(parcel, readHeader));
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 4:
                            valueOf = Double.valueOf(SafeParcelReader.readDouble(parcel, readHeader));
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 5:
                            valueOf = SafeParcelReader.createBigDecimal(parcel, readHeader);
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(SafeParcelReader.readBoolean(parcel, readHeader));
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 7:
                            valueOf = SafeParcelReader.createString(parcel, readHeader);
                            zaD = FastJsonResponse.zaD(field, valueOf);
                            break;
                        case 8:
                        case 9:
                            zaD = FastJsonResponse.zaD(field, SafeParcelReader.createByteArray(parcel, readHeader));
                            break;
                        case 10:
                            Bundle createBundle = SafeParcelReader.createBundle(parcel, readHeader);
                            HashMap hashMap = new HashMap();
                            for (String str2 : createBundle.keySet()) {
                                hashMap.put(str2, (String) Preconditions.checkNotNull(createBundle.getString(str2)));
                            }
                            zaD = FastJsonResponse.zaD(field, hashMap);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(C0510h.m12340a(36, "Unknown field out type = ", i));
                    }
                    zaJ(sb, field, zaD);
                } else {
                    if (field.zad) {
                        sb.append("[");
                        switch (field.zac) {
                            case 0:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, readHeader));
                                break;
                            case 1:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBigIntegerArray(parcel, readHeader));
                                break;
                            case 2:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, readHeader));
                                break;
                            case 3:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, readHeader));
                                break;
                            case 4:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, readHeader));
                                break;
                            case 5:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBigDecimalArray(parcel, readHeader));
                                break;
                            case 6:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, readHeader));
                                break;
                            case 7:
                                ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, readHeader));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] createParcelArray = SafeParcelReader.createParcelArray(parcel, readHeader);
                                int length = createParcelArray.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    createParcelArray[i2].setDataPosition(0);
                                    zaH(sb, field.zah(), createParcelArray[i2]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (field.zac) {
                            case 0:
                                sb.append(SafeParcelReader.readInt(parcel, readHeader));
                                break;
                            case 1:
                                createBigInteger = SafeParcelReader.createBigInteger(parcel, readHeader);
                                sb.append(createBigInteger);
                                break;
                            case 2:
                                sb.append(SafeParcelReader.readLong(parcel, readHeader));
                                break;
                            case 3:
                                sb.append(SafeParcelReader.readFloat(parcel, readHeader));
                                break;
                            case 4:
                                sb.append(SafeParcelReader.readDouble(parcel, readHeader));
                                break;
                            case 5:
                                createBigInteger = SafeParcelReader.createBigDecimal(parcel, readHeader);
                                sb.append(createBigInteger);
                                break;
                            case 6:
                                sb.append(SafeParcelReader.readBoolean(parcel, readHeader));
                                break;
                            case 7:
                                String createString = SafeParcelReader.createString(parcel, readHeader);
                                sb.append("\"");
                                escapeString = JsonUtils.escapeString(createString);
                                sb.append(escapeString);
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] createByteArray = SafeParcelReader.createByteArray(parcel, readHeader);
                                sb.append("\"");
                                escapeString = Base64Utils.encode(createByteArray);
                                sb.append(escapeString);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] createByteArray2 = SafeParcelReader.createByteArray(parcel, readHeader);
                                sb.append("\"");
                                escapeString = Base64Utils.encodeUrlSafe(createByteArray2);
                                sb.append(escapeString);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle createBundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                                Set<String> keySet = createBundle2.keySet();
                                sb.append("{");
                                boolean z2 = true;
                                for (String str3 : keySet) {
                                    if (!z2) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str3);
                                    sb.append("\":\"");
                                    sb.append(JsonUtils.escapeString(createBundle2.getString(str3)));
                                    sb.append("\"");
                                    z2 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel createParcel = SafeParcelReader.createParcel(parcel, readHeader);
                                createParcel.setDataPosition(0);
                                zaH(sb, field.zah(), createParcel);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb.append(str);
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            sb.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException(C0510h.m12340a(37, "Overread allowed size end=", validateObjectHeader), parcel);
    }

    private static final void zaI(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(C0510h.m12340a(26, "Unknown type = ", i));
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.zab) {
            zaI(sb, field.zaa, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            zaI(sb, field.zaa, arrayList.get(i));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @NonNull T t) {
        zaG(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final Object getValueObject(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, boolean z) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, int i) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, long j) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), zaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac != 0 ? this.zad : null, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final Parcel zaE() {
        int i = this.zaf;
        if (i != 0) {
            if (i == 1) {
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            }
            return this.zab;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
        this.zag = beginObjectHeader;
        SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
        this.zaf = 2;
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<BigDecimal> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<BigInteger> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<Boolean> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList.get(i).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, double d) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<Double> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, float f) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<Float> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<Integer> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @Nullable ArrayList<Long> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList.get(i).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }
}
