package com.example.dllo.homemycar.entity; /*
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

import java.util.List;

/**
 * Created by dllo on 16/9/29.
 */
public class SpeakEntity {

    /**
     * returncode : 0
     * message :
     * result : {"total":10612,"isloadmore":true,"list":[{"id":532118,"title":"关于刹车，真的是力越大就越好用吗？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M07/5F/1C/160x120_0_autohomecar__wKgH5Ffs1iWAHJ_jAAGzgjHY7Uw227.jpg","replycount":6,"pagecount":1,"jumppage":1,"updatetime":"20160929165152","lastid":"20160929203000532118"},{"id":538523,"title":"底盘护板要不要装？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g9/M13/5E/24/160x120_0_autohomecar__wKgH0FfsumWAOYmgAAFstv_n3zM669.jpg","replycount":71,"pagecount":1,"jumppage":1,"updatetime":"20160929145331","lastid":"20160929200000538523"},{"id":537797,"title":"解读特斯拉8.0固件：安全才是核心！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M0D/58/31/160x120_0_autohomecar__wKgH2lfnn06AJ9moAADma53RXXQ836.jpg","replycount":8,"pagecount":1,"jumppage":1,"updatetime":"20160928154950","lastid":"20160929200000537797"},{"id":538587,"title":"每年仅产50辆 试驾MINI顶级运动小钢炮","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g21/M02/3E/1A/160x120_0_autohomecar__wKjBwlfszjOAMCu_AAFXfdP5NBY400.jpg","replycount":35,"pagecount":1,"jumppage":1,"updatetime":"20160929164552","lastid":"20160929190000538587"},{"id":538516,"title":"众泰SR9、大迈X7迎全新兄弟T700","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M03/5E/A0/160x120_0_autohomecar__wKgH4VfsrvKAeA0PAAJi_67p9Vo041.jpg","replycount":333,"pagecount":1,"jumppage":1,"updatetime":"20160929140435","lastid":"20160929180000538516"},{"id":538594,"title":"进口版配置大曝光 揭秘路虎全新发现5","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M0D/5F/22/160x120_0_autohomecar__wKjBylfs1AmAULG5AAW8PgUwbSk901.jpg","replycount":170,"pagecount":1,"jumppage":1,"updatetime":"20160929172347","lastid":"20160929172000538594"},{"id":537279,"title":"这车用法拉利发动机，却卖着普通车价钱","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M02/4E/33/160x120_0_autohomecar__wKgH51fjSNGAE7axAAiZ4yyR_uI831.jpg","replycount":48,"pagecount":1,"jumppage":1,"updatetime":"20160926110703","lastid":"20160929170000537279"},{"id":538419,"title":"海外媒体怎么评价新雅阁锐混动","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M10/5A/81/160x120_0_autohomecar__wKgH51fsq7CAGLovAAIE4zRru5M659.jpg","replycount":90,"pagecount":1,"jumppage":1,"updatetime":"20160929135041","lastid":"20160929160000538419"},{"id":538442,"title":"大众第十三个品牌，或诞生于江淮大众？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/5E/32/160x120_0_autohomecar__wKjBzFfsvCSAPi2FAAHHnGNtdvU440.jpg","replycount":205,"pagecount":1,"jumppage":1,"updatetime":"20160929150100","lastid":"20160929153000538442"},{"id":538408,"title":"你关注过红绿灯的放行顺序吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M11/5E/3C/160x120_0_autohomecar__wKgH4VfsfAiAL7UjAADVnQxnbdk801.jpg","replycount":190,"pagecount":1,"jumppage":1,"updatetime":"20160929102722","lastid":"20160929150000538408"},{"id":538509,"title":"第三版前脸现身，操碎了心的长安CS95","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M0A/5E/10/160x120_0_autohomecar__wKjBzFfsqx6AKLlgAAKeVSSayv4432.jpg","replycount":612,"pagecount":1,"jumppage":1,"updatetime":"20160929134815","lastid":"20160929143000538509"},{"id":537979,"title":"450万造一台赛车 沃尔沃只为了刷圈速？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0C/59/F4/160x120_0_autohomecar__wKgH4Ffo37SAJAfCAAF23hxDNX4341.jpg","replycount":144,"pagecount":1,"jumppage":1,"updatetime":"20160927105854","lastid":"20160929140000537979"},{"id":538496,"title":"美国十大畅销豪华SUV 宝马奔驰双入","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M13/5F/05/160x120_0_autohomecar__wKjByFfsgFeAZ5paAAPd9lVepag196.jpg","replycount":240,"pagecount":1,"jumppage":1,"updatetime":"20160929104544","lastid":"20160929130000538496"},{"id":538309,"title":"主打SUV与新能源 巴黎车展概念车大集合","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g23/M15/3E/71/160x120_0_autohomecar__wKjBwFfrkayAHaKIAAHng7GBdrQ085.jpg","replycount":109,"pagecount":1,"jumppage":1,"updatetime":"20160928174726","lastid":"20160929120000538309"},{"id":538422,"title":"1.4T可以期待 聊全新指南者未公开信息","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0A/5B/C5/160x120_0_autohomecar__wKgH1lfrteWAI0VxAAOTkWU02UI520.jpg","replycount":427,"pagecount":1,"jumppage":1,"updatetime":"20160928213837","lastid":"20160929112000538422"},{"id":538434,"title":"BJ80的印度表亲 \"三哥\"山寨G级怎么样","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M02/5D/3D/160x120_0_autohomecar__wKjBzVfrzLKAcCquAAFGuiCPN6A884.jpg","replycount":203,"pagecount":1,"jumppage":1,"updatetime":"20160929134625","lastid":"20160929104000538434"},{"id":538006,"title":"这辈子一定要开一下自然吸气V12","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0D/3B/CA/160x120_0_autohomecar__wKgFW1fp13OAHH50AAH_W3mVNAI207.jpg","replycount":203,"pagecount":1,"jumppage":1,"updatetime":"20160927103507","lastid":"20160929103000538006"},{"id":538234,"title":"我军历次阅兵检阅用车大巡礼(上篇)","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M0C/55/B8/160x120_0_autohomecar__wKjBzlfqqWeADrIRAAEviAYwGXg390.jpg","replycount":93,"pagecount":1,"jumppage":1,"updatetime":"20160928095022","lastid":"20160929100000538234"},{"id":538141,"title":"快乐比速度更耐人寻味丨约\"炮\"TTS","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M05/3A/A8/160x120_0_autohomecar__wKjBw1fqGeSAQnNtAA0NXTxvRmA243.jpg","replycount":98,"pagecount":1,"jumppage":1,"updatetime":"20160927150455","lastid":"20160929094000538141"},{"id":536829,"title":"老司机:四轮定位这玩意调不好可危险了","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M13/2D/CB/160x120_0_autohomecar__wKgFU1fgyHqAVrLSAAMHTOtkrMA451.jpg","replycount":216,"pagecount":1,"jumppage":1,"updatetime":"20160920132620","lastid":"20160929090000536829"},{"id":538322,"title":"取悦你的手\u2014\u2014解析换挡器的今生和未来","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0C/3D/D3/160x120_0_autohomecar__wKgFW1frPL-AGBjiAAZyhCSyhwk752.PNG","replycount":195,"pagecount":1,"jumppage":1,"updatetime":"20160928175444","lastid":"20160929073000538322"},{"id":538385,"title":"30年来，还有那么多你没见过的M3！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M0A/5D/DA/160x120_0_autohomecar__wKjByFfrgAOAUvWhAAIuGsCY3GE471.jpg","replycount":84,"pagecount":1,"jumppage":1,"updatetime":"20160928163205","lastid":"20160929060600538385"},{"id":537965,"title":"保时捷911 R是最好的保时捷911吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M08/56/D5/160x120_0_autohomecar__wKgHzFfo04mAH9c_AAlqXVxc32c165.jpg","replycount":77,"pagecount":1,"jumppage":1,"updatetime":"20160926180235","lastid":"20160929000100537965"},{"id":538357,"title":"6万买了台神车，为何被我拉进了黑名单","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g16/M0C/59/94/160x120_0_autohomecar__wKgH11frZcaAWrEYAAaCshdW9sQ038.jpg","replycount":674,"pagecount":1,"jumppage":1,"updatetime":"20160928144010","lastid":"20160928220000538357"},{"id":537781,"title":"中东的\u201c普桑\u201d你见过么？","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g6/M0E/57/B3/160x120_0_autohomecar__wKjB0Vfoj7mADH15AAIxU2RiKsQ889.jpg","replycount":99,"pagecount":1,"jumppage":1,"updatetime":"20160928181321","lastid":"20160928213000537781"},{"id":538113,"title":"这车开不快没操控，却只差没有卖上月球","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M0D/56/7C/160x120_0_autohomecar__wKgH51fp5zuAZXPaAAe620ylvOE753.jpg","replycount":1539,"pagecount":1,"jumppage":1,"updatetime":"20160927153028","lastid":"20160928210000538113"},{"id":538231,"title":"不扯别的，咱就说比亚迪M6值得买吗？","time":"2016-09-28","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M0A/39/FB/160x120_0_autohomecar__wKgFVFfqh5KALZ0xAAEBvwCOzvg878.jpg","replycount":358,"pagecount":1,"jumppage":1,"updatetime":"20160928103605","lastid":"20160928203000538231"},{"id":537190,"title":"发动机平衡轴到底有什么用？","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g4/M10/4E/76/160x120_0_autohomecar__wKgHy1fijwmACR5HAAMyLRXbNhA809.jpg","replycount":139,"pagecount":1,"jumppage":1,"updatetime":"20160928182450","lastid":"20160928200000537190"},{"id":538406,"title":"国产高颜值幽灵座驾--升仕250","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M15/59/4B/160x120_0_autohomecar__wKgH51froJqAPn_GABADjGpRsk0949.jpg","replycount":209,"pagecount":1,"jumppage":1,"updatetime":"20160928190253","lastid":"20160928190000538406"},{"id":538158,"title":"下雨天不再愁 七招教你告别后视镜模糊","time":"2016-09-28","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M01/5B/06/160x120_0_autohomecar__wKgH5FfqGjyAO934AAHC5EVYoSE681.jpg","replycount":143,"pagecount":1,"jumppage":1,"updatetime":"20160927150534","lastid":"20160928180000538158"}]}
     */

    private int returncode;
    private String message;
    /**
     * total : 10612
     * isloadmore : true
     * list : [{"id":532118,"title":"关于刹车，真的是力越大就越好用吗？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M07/5F/1C/160x120_0_autohomecar__wKgH5Ffs1iWAHJ_jAAGzgjHY7Uw227.jpg","replycount":6,"pagecount":1,"jumppage":1,"updatetime":"20160929165152","lastid":"20160929203000532118"},{"id":538523,"title":"底盘护板要不要装？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g9/M13/5E/24/160x120_0_autohomecar__wKgH0FfsumWAOYmgAAFstv_n3zM669.jpg","replycount":71,"pagecount":1,"jumppage":1,"updatetime":"20160929145331","lastid":"20160929200000538523"},{"id":537797,"title":"解读特斯拉8.0固件：安全才是核心！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M0D/58/31/160x120_0_autohomecar__wKgH2lfnn06AJ9moAADma53RXXQ836.jpg","replycount":8,"pagecount":1,"jumppage":1,"updatetime":"20160928154950","lastid":"20160929200000537797"},{"id":538587,"title":"每年仅产50辆 试驾MINI顶级运动小钢炮","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g21/M02/3E/1A/160x120_0_autohomecar__wKjBwlfszjOAMCu_AAFXfdP5NBY400.jpg","replycount":35,"pagecount":1,"jumppage":1,"updatetime":"20160929164552","lastid":"20160929190000538587"},{"id":538516,"title":"众泰SR9、大迈X7迎全新兄弟T700","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M03/5E/A0/160x120_0_autohomecar__wKgH4VfsrvKAeA0PAAJi_67p9Vo041.jpg","replycount":333,"pagecount":1,"jumppage":1,"updatetime":"20160929140435","lastid":"20160929180000538516"},{"id":538594,"title":"进口版配置大曝光 揭秘路虎全新发现5","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M0D/5F/22/160x120_0_autohomecar__wKjBylfs1AmAULG5AAW8PgUwbSk901.jpg","replycount":170,"pagecount":1,"jumppage":1,"updatetime":"20160929172347","lastid":"20160929172000538594"},{"id":537279,"title":"这车用法拉利发动机，却卖着普通车价钱","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M02/4E/33/160x120_0_autohomecar__wKgH51fjSNGAE7axAAiZ4yyR_uI831.jpg","replycount":48,"pagecount":1,"jumppage":1,"updatetime":"20160926110703","lastid":"20160929170000537279"},{"id":538419,"title":"海外媒体怎么评价新雅阁锐混动","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M10/5A/81/160x120_0_autohomecar__wKgH51fsq7CAGLovAAIE4zRru5M659.jpg","replycount":90,"pagecount":1,"jumppage":1,"updatetime":"20160929135041","lastid":"20160929160000538419"},{"id":538442,"title":"大众第十三个品牌，或诞生于江淮大众？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/5E/32/160x120_0_autohomecar__wKjBzFfsvCSAPi2FAAHHnGNtdvU440.jpg","replycount":205,"pagecount":1,"jumppage":1,"updatetime":"20160929150100","lastid":"20160929153000538442"},{"id":538408,"title":"你关注过红绿灯的放行顺序吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M11/5E/3C/160x120_0_autohomecar__wKgH4VfsfAiAL7UjAADVnQxnbdk801.jpg","replycount":190,"pagecount":1,"jumppage":1,"updatetime":"20160929102722","lastid":"20160929150000538408"},{"id":538509,"title":"第三版前脸现身，操碎了心的长安CS95","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M0A/5E/10/160x120_0_autohomecar__wKjBzFfsqx6AKLlgAAKeVSSayv4432.jpg","replycount":612,"pagecount":1,"jumppage":1,"updatetime":"20160929134815","lastid":"20160929143000538509"},{"id":537979,"title":"450万造一台赛车 沃尔沃只为了刷圈速？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0C/59/F4/160x120_0_autohomecar__wKgH4Ffo37SAJAfCAAF23hxDNX4341.jpg","replycount":144,"pagecount":1,"jumppage":1,"updatetime":"20160927105854","lastid":"20160929140000537979"},{"id":538496,"title":"美国十大畅销豪华SUV 宝马奔驰双入","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M13/5F/05/160x120_0_autohomecar__wKjByFfsgFeAZ5paAAPd9lVepag196.jpg","replycount":240,"pagecount":1,"jumppage":1,"updatetime":"20160929104544","lastid":"20160929130000538496"},{"id":538309,"title":"主打SUV与新能源 巴黎车展概念车大集合","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g23/M15/3E/71/160x120_0_autohomecar__wKjBwFfrkayAHaKIAAHng7GBdrQ085.jpg","replycount":109,"pagecount":1,"jumppage":1,"updatetime":"20160928174726","lastid":"20160929120000538309"},{"id":538422,"title":"1.4T可以期待 聊全新指南者未公开信息","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0A/5B/C5/160x120_0_autohomecar__wKgH1lfrteWAI0VxAAOTkWU02UI520.jpg","replycount":427,"pagecount":1,"jumppage":1,"updatetime":"20160928213837","lastid":"20160929112000538422"},{"id":538434,"title":"BJ80的印度表亲 \"三哥\"山寨G级怎么样","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M02/5D/3D/160x120_0_autohomecar__wKjBzVfrzLKAcCquAAFGuiCPN6A884.jpg","replycount":203,"pagecount":1,"jumppage":1,"updatetime":"20160929134625","lastid":"20160929104000538434"},{"id":538006,"title":"这辈子一定要开一下自然吸气V12","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0D/3B/CA/160x120_0_autohomecar__wKgFW1fp13OAHH50AAH_W3mVNAI207.jpg","replycount":203,"pagecount":1,"jumppage":1,"updatetime":"20160927103507","lastid":"20160929103000538006"},{"id":538234,"title":"我军历次阅兵检阅用车大巡礼(上篇)","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M0C/55/B8/160x120_0_autohomecar__wKjBzlfqqWeADrIRAAEviAYwGXg390.jpg","replycount":93,"pagecount":1,"jumppage":1,"updatetime":"20160928095022","lastid":"20160929100000538234"},{"id":538141,"title":"快乐比速度更耐人寻味丨约\"炮\"TTS","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M05/3A/A8/160x120_0_autohomecar__wKjBw1fqGeSAQnNtAA0NXTxvRmA243.jpg","replycount":98,"pagecount":1,"jumppage":1,"updatetime":"20160927150455","lastid":"20160929094000538141"},{"id":536829,"title":"老司机:四轮定位这玩意调不好可危险了","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M13/2D/CB/160x120_0_autohomecar__wKgFU1fgyHqAVrLSAAMHTOtkrMA451.jpg","replycount":216,"pagecount":1,"jumppage":1,"updatetime":"20160920132620","lastid":"20160929090000536829"},{"id":538322,"title":"取悦你的手\u2014\u2014解析换挡器的今生和未来","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0C/3D/D3/160x120_0_autohomecar__wKgFW1frPL-AGBjiAAZyhCSyhwk752.PNG","replycount":195,"pagecount":1,"jumppage":1,"updatetime":"20160928175444","lastid":"20160929073000538322"},{"id":538385,"title":"30年来，还有那么多你没见过的M3！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M0A/5D/DA/160x120_0_autohomecar__wKjByFfrgAOAUvWhAAIuGsCY3GE471.jpg","replycount":84,"pagecount":1,"jumppage":1,"updatetime":"20160928163205","lastid":"20160929060600538385"},{"id":537965,"title":"保时捷911 R是最好的保时捷911吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M08/56/D5/160x120_0_autohomecar__wKgHzFfo04mAH9c_AAlqXVxc32c165.jpg","replycount":77,"pagecount":1,"jumppage":1,"updatetime":"20160926180235","lastid":"20160929000100537965"},{"id":538357,"title":"6万买了台神车，为何被我拉进了黑名单","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g16/M0C/59/94/160x120_0_autohomecar__wKgH11frZcaAWrEYAAaCshdW9sQ038.jpg","replycount":674,"pagecount":1,"jumppage":1,"updatetime":"20160928144010","lastid":"20160928220000538357"},{"id":537781,"title":"中东的\u201c普桑\u201d你见过么？","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g6/M0E/57/B3/160x120_0_autohomecar__wKjB0Vfoj7mADH15AAIxU2RiKsQ889.jpg","replycount":99,"pagecount":1,"jumppage":1,"updatetime":"20160928181321","lastid":"20160928213000537781"},{"id":538113,"title":"这车开不快没操控，却只差没有卖上月球","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M0D/56/7C/160x120_0_autohomecar__wKgH51fp5zuAZXPaAAe620ylvOE753.jpg","replycount":1539,"pagecount":1,"jumppage":1,"updatetime":"20160927153028","lastid":"20160928210000538113"},{"id":538231,"title":"不扯别的，咱就说比亚迪M6值得买吗？","time":"2016-09-28","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M0A/39/FB/160x120_0_autohomecar__wKgFVFfqh5KALZ0xAAEBvwCOzvg878.jpg","replycount":358,"pagecount":1,"jumppage":1,"updatetime":"20160928103605","lastid":"20160928203000538231"},{"id":537190,"title":"发动机平衡轴到底有什么用？","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g4/M10/4E/76/160x120_0_autohomecar__wKgHy1fijwmACR5HAAMyLRXbNhA809.jpg","replycount":139,"pagecount":1,"jumppage":1,"updatetime":"20160928182450","lastid":"20160928200000537190"},{"id":538406,"title":"国产高颜值幽灵座驾--升仕250","time":"2016-09-28","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M15/59/4B/160x120_0_autohomecar__wKgH51froJqAPn_GABADjGpRsk0949.jpg","replycount":209,"pagecount":1,"jumppage":1,"updatetime":"20160928190253","lastid":"20160928190000538406"},{"id":538158,"title":"下雨天不再愁 七招教你告别后视镜模糊","time":"2016-09-28","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g14/M01/5B/06/160x120_0_autohomecar__wKgH5FfqGjyAO934AAHC5EVYoSE681.jpg","replycount":143,"pagecount":1,"jumppage":1,"updatetime":"20160927150534","lastid":"20160928180000538158"}]
     */

    private ResultBean result;

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int total;
        private boolean isloadmore;
        /**
         * id : 532118
         * title : 关于刹车，真的是力越大就越好用吗？
         * time : 2016-09-29
         * type :
         * smallpic : http://www2.autoimg.cn/newsdfs/g14/M07/5F/1C/160x120_0_autohomecar__wKgH5Ffs1iWAHJ_jAAGzgjHY7Uw227.jpg
         * replycount : 6
         * pagecount : 1
         * jumppage : 1
         * updatetime : 20160929165152
         * lastid : 20160929203000532118
         */

        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private int id;
            private String title;
            private String time;
            private String type;
            private String smallpic;
            private int replycount;
            private int pagecount;
            private int jumppage;
            private String updatetime;
            private String lastid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPagecount() {
                return pagecount;
            }

            public void setPagecount(int pagecount) {
                this.pagecount = pagecount;
            }

            public int getJumppage() {
                return jumppage;
            }

            public void setJumppage(int jumppage) {
                this.jumppage = jumppage;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getLastid() {
                return lastid;
            }

            public void setLastid(String lastid) {
                this.lastid = lastid;
            }
        }
    }
}
