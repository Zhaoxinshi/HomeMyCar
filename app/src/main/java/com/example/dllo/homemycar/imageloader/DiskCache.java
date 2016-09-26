package com.example.dllo.homemycar.imageloader; /*
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
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;

import com.android.volley.toolbox.ImageLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dllo on 16/9/22.
 */
//硬盘缓存
public class DiskCache implements ImageLoader.ImageCache {

    private final File cacheDir;

    public DiskCache(Context context) {
        //获得缓存路径
        cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {//如果该路径还没有,那么就创建该路径
            //创建
            cacheDir.mkdir();


        }
    }

    @Override
    public Bitmap getBitmap(String url) {
        String name = MD5Util.getMD5String(url);
        File image = new File(cacheDir, name);
        if (image.exists()){
            return null;
        }
        //如果没有读到就是这写错了
        Bitmap bitmap = BitmapFactory.decodeFile(image.getPath());
        return bitmap;
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {

        //把url 用 MD5 处理一下
        String name = MD5Util.getMD5String(url);
        File image = new File(cacheDir, name);

        try {
            if (image.exists()) {
                //如果图片文件不存在,就创建一个图片文件

                image.createNewFile();

            }
            //文件的输出流
            FileOutputStream fos = new FileOutputStream(image);
            //把图片变成二进制数组
            ByteArrayOutputStream byteArrayOutputStream = new
                    ByteArrayOutputStream();
            //通过这个方法将图片换成二进制数组
            bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            fos.write(bytes);
            byteArrayOutputStream.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
