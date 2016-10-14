package com.example.dllo.homemycar.adapter; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.AmpleEntity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

/**
 * Created by dllo on 16/10/12.
 */
public class AmpleAdapter extends BaseAdapter {
    private Context context;
    private AmpleEntity entity;

    public void setEntity(AmpleEntity entity) {
        this.entity = entity;
        notifyDataSetChanged();
    }

    public AmpleAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getNewslist().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getNewslist().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        AmplViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_ample_fragment, viewGroup, false);
            holder = new AmplViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (AmplViewHolder) view.getTag();
        }

        holder.tvCicle.setText(entity.getResult().getNewslist().get(i).getUsername());
        holder.tvTitle.setText(entity.getResult().getNewslist().get(i).getTitle());
        Picasso.with(context).load(entity.getResult().getNewslist().get(i).getUserpic()).transform(new CircleTransform()).into(holder.imaAuthor);
        Picasso.with(context).load(entity.getResult().getNewslist().get(i).getThumbnailpics().get(0)).into(holder.ima);
        holder.tvDate.setText(entity.getResult().getNewslist().get(i).getPublishtime());
        holder.tvRel.setText(entity.getResult().getNewslist().get(i).getReplycount() + "" + "评论");
        holder.tvZan.setText(entity.getResult().getNewslist().get(i).getPraisenum() + "" + "赞");


        return view;
    }

    class AmplViewHolder {
        private TextView tvCicle, tvTitle, tvDate, tvRel, tvZan;
        private ImageView imaAuthor, ima;

        public AmplViewHolder(View view) {
            tvCicle = (TextView) view.findViewById(R.id.item_ample_fragment_tv_cicle);
            tvTitle = (TextView) view.findViewById(R.id.item_ample_fragment_tv_title);
            tvDate = (TextView) view.findViewById(R.id.item_ample_fragment_tv_date);
            tvRel = (TextView) view.findViewById(R.id.item_ample_fragment_tv_rey);
            tvZan = (TextView) view.findViewById(R.id.item_ample_fragment_tv_zan);
            ima = (ImageView) view.findViewById(R.id.item_ample_fragment_ima);
            imaAuthor = (ImageView) view.findViewById(R.id.item_ample_fragment_ima_author);
        }
    }
    public class CircleTransform implements Transformation {
        @Override
        public Bitmap transform(Bitmap source) {
            int size = Math.min(source.getWidth(), source.getHeight());

            int x = (source.getWidth() - size) / 2;
            int y = (source.getHeight() - size) / 2;

            Bitmap squaredBitmap = Bitmap.createBitmap(source, x, y, size, size);
            if (squaredBitmap != source) {
                source.recycle();
            }

            Bitmap bitmap = Bitmap.createBitmap(size, size, source.getConfig());

            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            BitmapShader shader = new BitmapShader(squaredBitmap,
                    BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
            paint.setShader(shader);
            paint.setAntiAlias(true);

            float r = size / 2f;
            canvas.drawCircle(r, r, r, paint);

            squaredBitmap.recycle();
            return bitmap;
        }

        @Override
        public String key() {
            return "circle";
        }

    }
}
