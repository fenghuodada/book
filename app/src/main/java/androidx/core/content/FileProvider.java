package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.core.content.ContextCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: b */
    public static final String[] f2324b = {"_display_name", "_size"};

    /* renamed from: c */
    public static final File f2325c = new File(RemoteSettings.FORWARD_SLASH_STRING);
    @GuardedBy("sCache")

    /* renamed from: d */
    public static final HashMap<String, InterfaceC0656b> f2326d = new HashMap<>();

    /* renamed from: a */
    public InterfaceC0656b f2327a;

    @RequiresApi(21)
    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes.dex */
    public static class C0655a {
        @DoNotInline
        /* renamed from: a */
        public static File[] m12020a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0656b {
        /* renamed from: a */
        File mo12019a(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    /* loaded from: classes.dex */
    public static class C0657c implements InterfaceC0656b {

        /* renamed from: a */
        public final HashMap<String, File> f2328a = new HashMap<>();

        @Override // androidx.core.content.FileProvider.InterfaceC0656b
        /* renamed from: a */
        public final File mo12019a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2328a.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC0656b m12022a(Context context, String str) {
        InterfaceC0656b interfaceC0656b;
        HashMap<String, InterfaceC0656b> hashMap = f2326d;
        synchronized (hashMap) {
            interfaceC0656b = hashMap.get(str);
            if (interfaceC0656b == null) {
                try {
                    try {
                        interfaceC0656b = m12021b(context, str);
                        hashMap.put(str, interfaceC0656b);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0656b;
    }

    /* renamed from: b */
    public static C0657c m12021b(Context context, String str) throws IOException, XmlPullParserException {
        C0657c c0657c = new C0657c();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            Bundle bundle = resolveContentProvider.metaData;
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f2325c;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            Object obj = ContextCompat.f2323a;
                            File[] m12035b = ContextCompat.C0650b.m12035b(context, null);
                            if (m12035b.length > 0) {
                                file = m12035b[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            Object obj2 = ContextCompat.f2323a;
                            File[] m12036a = ContextCompat.C0650b.m12036a(context);
                            if (m12036a.length > 0) {
                                file = m12036a[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] m12020a = C0655a.m12020a(context);
                            if (m12020a.length > 0) {
                                file = m12020a[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            if (attributeValue2 != null) {
                                file = new File(file, attributeValue2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    c0657c.f2328a.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return c0657c;
                }
            }
        } else {
            throw new IllegalArgumentException(C0552c.m12192b("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, InterfaceC0656b> hashMap = f2326d;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f2327a = m12022a(context, str);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return this.f2327a.mo12019a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        File mo12019a = this.f2327a.mo12019a(uri);
        int lastIndexOf = mo12019a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo12019a.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        int i;
        File mo12019a = this.f2327a.mo12019a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException(C0552c.m12192b("Invalid mode: ", str));
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(mo12019a, i);
    }

    @Override // android.content.ContentProvider
    @NonNull
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        String str3;
        File mo12019a = this.f2327a.mo12019a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f2324b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = mo12019a.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo12019a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
