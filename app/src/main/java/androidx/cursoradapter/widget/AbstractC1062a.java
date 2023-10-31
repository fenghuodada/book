package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0235r;
import androidx.cursoradapter.widget.C1065b;

/* renamed from: androidx.cursoradapter.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC1062a extends BaseAdapter implements Filterable, C1065b.InterfaceC1066a {
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: g */
    public C1065b f2739g;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: b */
    public boolean f2734b = true;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: c */
    public Cursor f2735c = null;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: a */
    public boolean f2733a = false;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: d */
    public int f2736d = -1;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: e */
    public C1063a f2737e = new C1063a();
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: f */
    public C1064b f2738f = new C1064b();

    /* renamed from: androidx.cursoradapter.widget.a$a */
    /* loaded from: classes.dex */
    public class C1063a extends ContentObserver {
        public C1063a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            AbstractC1062a abstractC1062a = AbstractC1062a.this;
            if (abstractC1062a.f2734b && (cursor = abstractC1062a.f2735c) != null && !cursor.isClosed()) {
                abstractC1062a.f2733a = abstractC1062a.f2735c.requery();
            }
        }
    }

    /* renamed from: androidx.cursoradapter.widget.a$b */
    /* loaded from: classes.dex */
    public class C1064b extends DataSetObserver {
        public C1064b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            AbstractC1062a abstractC1062a = AbstractC1062a.this;
            abstractC1062a.f2733a = true;
            abstractC1062a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            AbstractC1062a abstractC1062a = AbstractC1062a.this;
            abstractC1062a.f2733a = false;
            abstractC1062a.notifyDataSetInvalidated();
        }
    }

    public AbstractC1062a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo11241a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo11240b(Cursor cursor) {
        Cursor cursor2 = this.f2735c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1063a c1063a = this.f2737e;
                if (c1063a != null) {
                    cursor2.unregisterContentObserver(c1063a);
                }
                C1064b c1064b = this.f2738f;
                if (c1064b != null) {
                    cursor2.unregisterDataSetObserver(c1064b);
                }
            }
            this.f2735c = cursor;
            if (cursor != null) {
                C1063a c1063a2 = this.f2737e;
                if (c1063a2 != null) {
                    cursor.registerContentObserver(c1063a2);
                }
                C1064b c1064b2 = this.f2738f;
                if (c1064b2 != null) {
                    cursor.registerDataSetObserver(c1064b2);
                }
                this.f2736d = cursor.getColumnIndexOrThrow("_id");
                this.f2733a = true;
                notifyDataSetChanged();
            } else {
                this.f2736d = -1;
                this.f2733a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo11239c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo11238d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f2733a || (cursor = this.f2735c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f2733a) {
            this.f2735c.moveToPosition(i);
            if (view == null) {
                AbstractC1067c abstractC1067c = (AbstractC1067c) this;
                view = abstractC1067c.f2745j.inflate(abstractC1067c.f2744i, viewGroup, false);
            }
            mo11241a(view, this.f2735c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f2739g == null) {
            this.f2739g = new C1065b(this);
        }
        return this.f2739g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f2733a || (cursor = this.f2735c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2735c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f2733a && (cursor = this.f2735c) != null && cursor.moveToPosition(i)) {
            return this.f2735c.getLong(this.f2736d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f2733a) {
            if (this.f2735c.moveToPosition(i)) {
                if (view == null) {
                    view = mo11238d(viewGroup);
                }
                mo11241a(view, this.f2735c);
                return view;
            }
            throw new IllegalStateException(C0235r.m12816a("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
