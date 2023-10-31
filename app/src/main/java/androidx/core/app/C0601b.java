package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C0484a;
import androidx.core.content.ContextCompat;
import androidx.core.p003os.BuildCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public final class C0601b extends ContextCompat {

    /* renamed from: b */
    public static final /* synthetic */ int f2263b = 0;

    @RequiresApi(16)
    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    public static class C0602a {
        @DoNotInline
        /* renamed from: a */
        public static void m12101a(Activity activity) {
            activity.finishAffinity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12100b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12099c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    public static class C0603b {
        @DoNotInline
        /* renamed from: a */
        public static void m12098a(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12097b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12096c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m12095d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m12094e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    public static class C0604c {
        @DoNotInline
        /* renamed from: a */
        public static void m12093a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12092b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m12091c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0605d {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    public static class SharedElementCallbackC0606e extends SharedElementCallback {

        /* renamed from: a */
        public final AbstractC0631l0 f2264a;

        public SharedElementCallbackC0606e(AbstractC0631l0 abstractC0631l0) {
            this.f2264a = abstractC0631l0;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmap;
            Bitmap bitmap2;
            AbstractC0631l0 abstractC0631l0 = this.f2264a;
            abstractC0631l0.getClass();
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            int i = (int) (intrinsicWidth * min);
                            int i2 = (int) (intrinsicHeight * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                            bitmap2 = createBitmap;
                        }
                    } else {
                        bitmap2 = null;
                    }
                    if (bitmap2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap2);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            return bundle;
                        }
                        return bundle;
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round > 0 && round2 > 0) {
                float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                int i7 = (int) (round * min2);
                int i8 = (int) (round2 * min2);
                if (abstractC0631l0.f2297a == null) {
                    abstractC0631l0.f2297a = new Matrix();
                }
                abstractC0631l0.f2297a.set(matrix);
                abstractC0631l0.f2297a.postTranslate(-rectF.left, -rectF.top);
                abstractC0631l0.f2297a.postScale(min2, min2);
                bitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(abstractC0631l0.f2297a);
                view.draw(canvas2);
            } else {
                bitmap = null;
            }
            return bitmap;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.f2264a.getClass();
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                    return imageView;
                }
                return imageView;
            } else if (!(parcelable instanceof Bitmap)) {
                return null;
            } else {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f2264a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.f2264a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f2264a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f2264a.getClass();
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f2264a.getClass();
            C0604c.m12093a(onSharedElementsReadyListener);
        }
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    /* renamed from: c */
    public static void m12102c(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (!BuildCompat.m11866c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                throw new IllegalArgumentException(C0484a.m12392a(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC0605d) {
            ((InterfaceC0605d) activity).validateRequestPermissionsRequestCode(i);
        }
        C0604c.m12092b(activity, strArr, i);
    }
}
