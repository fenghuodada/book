package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.AbstractC1067c;
import com.ambrose.overwall.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.r1 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0409r1 extends AbstractC1067c implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f1356x = 0;

    /* renamed from: k */
    public final SearchView f1357k;

    /* renamed from: l */
    public final SearchableInfo f1358l;

    /* renamed from: m */
    public final Context f1359m;

    /* renamed from: n */
    public final WeakHashMap<String, Drawable.ConstantState> f1360n;

    /* renamed from: o */
    public final int f1361o;

    /* renamed from: p */
    public int f1362p;

    /* renamed from: q */
    public ColorStateList f1363q;

    /* renamed from: r */
    public int f1364r;

    /* renamed from: s */
    public int f1365s;

    /* renamed from: t */
    public int f1366t;

    /* renamed from: u */
    public int f1367u;

    /* renamed from: v */
    public int f1368v;

    /* renamed from: w */
    public int f1369w;

    /* renamed from: androidx.appcompat.widget.r1$a */
    /* loaded from: classes.dex */
    public static final class C0410a {

        /* renamed from: a */
        public final TextView f1370a;

        /* renamed from: b */
        public final TextView f1371b;

        /* renamed from: c */
        public final ImageView f1372c;

        /* renamed from: d */
        public final ImageView f1373d;

        /* renamed from: e */
        public final ImageView f1374e;

        public C0410a(View view) {
            this.f1370a = (TextView) view.findViewById(16908308);
            this.f1371b = (TextView) view.findViewById(16908309);
            this.f1372c = (ImageView) view.findViewById(16908295);
            this.f1373d = (ImageView) view.findViewById(16908296);
            this.f1374e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public View$OnClickListenerC0409r1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1362p = 1;
        this.f1364r = -1;
        this.f1365s = -1;
        this.f1366t = -1;
        this.f1367u = -1;
        this.f1368v = -1;
        this.f1369w = -1;
        this.f1357k = searchView;
        this.f1358l = searchableInfo;
        this.f1361o = searchView.getSuggestionCommitIconResId();
        this.f1359m = context;
        this.f1360n = weakHashMap;
    }

    /* renamed from: h */
    public static String m12523h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    @Override // androidx.cursoradapter.widget.AbstractC1062a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11241a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.View$OnClickListenerC0409r1.mo11241a(android.view.View, android.database.Cursor):void");
    }

    @Override // androidx.cursoradapter.widget.AbstractC1062a
    /* renamed from: b */
    public final void mo11240b(Cursor cursor) {
        try {
            super.mo11240b(cursor);
            if (cursor != null) {
                this.f1364r = cursor.getColumnIndex("suggest_text_1");
                this.f1365s = cursor.getColumnIndex("suggest_text_2");
                this.f1366t = cursor.getColumnIndex("suggest_text_2_url");
                this.f1367u = cursor.getColumnIndex("suggest_icon_1");
                this.f1368v = cursor.getColumnIndex("suggest_icon_2");
                this.f1369w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.AbstractC1062a
    /* renamed from: c */
    public final String mo11239c(Cursor cursor) {
        String m12523h;
        String m12523h2;
        if (cursor == null) {
            return null;
        }
        String m12523h3 = m12523h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m12523h3 != null) {
            return m12523h3;
        }
        SearchableInfo searchableInfo = this.f1358l;
        if (searchableInfo.shouldRewriteQueryFromData() && (m12523h2 = m12523h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m12523h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (m12523h = m12523h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m12523h;
    }

    @Override // androidx.cursoradapter.widget.AbstractC1062a
    /* renamed from: d */
    public final View mo11238d(ViewGroup viewGroup) {
        View inflate = this.f2745j.inflate(this.f2743h, viewGroup, false);
        inflate.setTag(new C0410a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f1361o);
        return inflate;
    }

    /* renamed from: e */
    public final Drawable m12526e(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1359m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m12525f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.View$OnClickListenerC0409r1.m12525f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public final Cursor m12524g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1359m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // androidx.cursoradapter.widget.AbstractC1062a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f2745j.inflate(this.f2744i, viewGroup, false);
            if (inflate != null) {
                ((C0410a) inflate.getTag()).f1370a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // androidx.cursoradapter.widget.AbstractC1062a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo11238d = mo11238d(viewGroup);
            ((C0410a) mo11238d.getTag()).f1370a.setText(e.toString());
            return mo11238d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f2735c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f2735c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1357k.m12783p((CharSequence) tag);
        }
    }
}
