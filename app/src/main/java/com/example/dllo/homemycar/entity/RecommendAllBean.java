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
 * Created by dllo on 16/9/30.
 */
public class RecommendAllBean {

    /**
     * returncode : 0
     * message :
     * result : {"total":10621,"isloadmore":true,"list":[{"id":535091,"title":"喝BBA锅里的汤，抢CT6和S90L锅里的肉","time":"2016-09-30","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M0A/5F/A4/160x120_0_autohomecar__wKgH3Vfsrn2AQbiyAAD4MpBhw64274.JPG","replycount":166,"pagecount":1,"jumppage":1,"updatetime":"20160930074648","lastid":"20160930074800535091"},{"id":538528,"title":"日系车在欧洲混不下去？","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g20/M04/3E/A3/160x120_0_autohomecar__wKjBw1fs0peAChefAAFGdcjipL0279.jpg","replycount":164,"pagecount":1,"jumppage":1,"updatetime":"20160929163640","lastid":"20160930073000538528"},{"id":537995,"title":"一汽轿车亏了8亿多 都是红旗的错？","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M07/59/A7/160x120_0_autohomecar__wKjBylfo7B6AMPF6AAH3mobaWW8993.jpg","replycount":792,"pagecount":1,"jumppage":1,"updatetime":"20160927092949","lastid":"20160930010100537995"},{"id":538075,"title":"捷达为什么比桑塔纳卖得好?","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g12/M0B/5B/4A/160x120_0_autohomecar__wKjBy1fp3guASKjPAAO_vQzmk48739.jpg","replycount":358,"pagecount":1,"jumppage":1,"updatetime":"20160927104844","lastid":"20160930000100538075"},{"id":538577,"title":"Top 10经典跑车，哪款是你的菜？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M05/5E/9C/160x120_0_autohomecar__wKgHz1fsu0yAAqVrAB2ilXRtOn4074.jpg","replycount":52,"pagecount":1,"jumppage":1,"updatetime":"20160929150419","lastid":"20160929230000538577"},{"id":538571,"title":"福特Mustang的前世今生","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M03/5E/90/160x120_0_autohomecar__wKgHz1fstS2AT_UZAAI_PlnHj8Q198.jpg","replycount":136,"pagecount":1,"jumppage":1,"updatetime":"20160929230054","lastid":"20160929223000538571"},{"id":538495,"title":"为什么你的车没有自动刹车技能？！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M0D/5F/3D/160x120_0_autohomecar__wKgH3Vfse4OAGw9_AAEDFMDn_Y4893.jpg","replycount":98,"pagecount":1,"jumppage":1,"updatetime":"20160929170322","lastid":"20160929220000538495"},{"id":538323,"title":"喜大普奔or哀鸿遍野 中国车市何去何从","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M14/5E/15/160x120_0_autohomecar__wKgH4VfsbMqALUpiAALK9YxXRr8692.jpg","replycount":230,"pagecount":1,"jumppage":1,"updatetime":"20160929092219","lastid":"20160929213000538323"},{"id":538470,"title":"美媒评出最佳驾驶者之车,榜霸竟是他们","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M01/3E/74/160x120_0_autohomecar__wKjBwVfsc7aAFKuiAADoFRmgPeU650.jpg","replycount":321,"pagecount":1,"jumppage":1,"updatetime":"20160929100813","lastid":"20160929210000538470"},{"id":532118,"title":"关于刹车，真的是力越大就越好用吗？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M07/5F/1C/160x120_0_autohomecar__wKgH5Ffs1iWAHJ_jAAGzgjHY7Uw227.jpg","replycount":167,"pagecount":1,"jumppage":1,"updatetime":"20160929165152","lastid":"20160929203000532118"},{"id":538523,"title":"底盘护板要不要装？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g9/M13/5E/24/160x120_0_autohomecar__wKgH0FfsumWAOYmgAAFstv_n3zM669.jpg","replycount":285,"pagecount":1,"jumppage":1,"updatetime":"20160929145331","lastid":"20160929200000538523"},{"id":537797,"title":"解读特斯拉8.0固件：安全才是核心！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M0D/58/31/160x120_0_autohomecar__wKgH2lfnn06AJ9moAADma53RXXQ836.jpg","replycount":34,"pagecount":1,"jumppage":1,"updatetime":"20160928154950","lastid":"20160929200000537797"},{"id":538587,"title":"每年仅产50辆 试驾MINI顶级运动小钢炮","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g21/M02/3E/1A/160x120_0_autohomecar__wKjBwlfszjOAMCu_AAFXfdP5NBY400.jpg","replycount":70,"pagecount":1,"jumppage":1,"updatetime":"20160929164552","lastid":"20160929190000538587"},{"id":538516,"title":"众泰SR9、大迈X7迎全新兄弟T700","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M03/5E/A0/160x120_0_autohomecar__wKgH4VfsrvKAeA0PAAJi_67p9Vo041.jpg","replycount":576,"pagecount":1,"jumppage":1,"updatetime":"20160929140435","lastid":"20160929180000538516"},{"id":538594,"title":"进口版配置大曝光 揭秘路虎全新发现5","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M0D/5F/22/160x120_0_autohomecar__wKjBylfs1AmAULG5AAW8PgUwbSk901.jpg","replycount":282,"pagecount":1,"jumppage":1,"updatetime":"20160929172347","lastid":"20160929172000538594"},{"id":537279,"title":"这车用法拉利发动机，却卖着普通车价钱","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M02/4E/33/160x120_0_autohomecar__wKgH51fjSNGAE7axAAiZ4yyR_uI831.jpg","replycount":63,"pagecount":1,"jumppage":1,"updatetime":"20160926110703","lastid":"20160929170000537279"},{"id":538419,"title":"海外媒体怎么评价新雅阁锐混动","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M10/5A/81/160x120_0_autohomecar__wKgH51fsq7CAGLovAAIE4zRru5M659.jpg","replycount":120,"pagecount":1,"jumppage":1,"updatetime":"20160929135041","lastid":"20160929160000538419"},{"id":538442,"title":"大众第十三个品牌，或诞生于江淮大众？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/5E/32/160x120_0_autohomecar__wKjBzFfsvCSAPi2FAAHHnGNtdvU440.jpg","replycount":253,"pagecount":1,"jumppage":1,"updatetime":"20160929150100","lastid":"20160929153000538442"},{"id":538408,"title":"你关注过红绿灯的放行顺序吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M11/5E/3C/160x120_0_autohomecar__wKgH4VfsfAiAL7UjAADVnQxnbdk801.jpg","replycount":247,"pagecount":1,"jumppage":1,"updatetime":"20160929102722","lastid":"20160929150000538408"},{"id":538509,"title":"第三版前脸现身，操碎了心的长安CS95","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M0A/5E/10/160x120_0_autohomecar__wKjBzFfsqx6AKLlgAAKeVSSayv4432.jpg","replycount":751,"pagecount":1,"jumppage":1,"updatetime":"20160929134815","lastid":"20160929143000538509"},{"id":537979,"title":"450万造一台赛车 沃尔沃只为了刷圈速？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0C/59/F4/160x120_0_autohomecar__wKgH4Ffo37SAJAfCAAF23hxDNX4341.jpg","replycount":169,"pagecount":1,"jumppage":1,"updatetime":"20160927105854","lastid":"20160929140000537979"},{"id":538496,"title":"美国十大畅销豪华SUV 宝马奔驰双入","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M13/5F/05/160x120_0_autohomecar__wKjByFfsgFeAZ5paAAPd9lVepag196.jpg","replycount":287,"pagecount":1,"jumppage":1,"updatetime":"20160929104544","lastid":"20160929130000538496"},{"id":538309,"title":"主打SUV与新能源 巴黎车展概念车大集合","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g23/M15/3E/71/160x120_0_autohomecar__wKjBwFfrkayAHaKIAAHng7GBdrQ085.jpg","replycount":110,"pagecount":1,"jumppage":1,"updatetime":"20160928174726","lastid":"20160929120000538309"},{"id":538422,"title":"1.4T可以期待 聊全新指南者未公开信息","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0A/5B/C5/160x120_0_autohomecar__wKgH1lfrteWAI0VxAAOTkWU02UI520.jpg","replycount":458,"pagecount":1,"jumppage":1,"updatetime":"20160928213837","lastid":"20160929112000538422"},{"id":538434,"title":"BJ80的印度表亲 \"三哥\"山寨G级怎么样","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M02/5D/3D/160x120_0_autohomecar__wKjBzVfrzLKAcCquAAFGuiCPN6A884.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160929134625","lastid":"20160929104000538434"},{"id":538006,"title":"这辈子一定要开一下自然吸气V12","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0D/3B/CA/160x120_0_autohomecar__wKgFW1fp13OAHH50AAH_W3mVNAI207.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160927103507","lastid":"20160929103000538006"},{"id":538234,"title":"我军历次阅兵检阅用车大巡礼(上篇)","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M0C/55/B8/160x120_0_autohomecar__wKjBzlfqqWeADrIRAAEviAYwGXg390.jpg","replycount":99,"pagecount":1,"jumppage":1,"updatetime":"20160928095022","lastid":"20160929100000538234"},{"id":538141,"title":"快乐比速度更耐人寻味丨约\"炮\"TTS","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M05/3A/A8/160x120_0_autohomecar__wKjBw1fqGeSAQnNtAA0NXTxvRmA243.jpg","replycount":107,"pagecount":1,"jumppage":1,"updatetime":"20160927150455","lastid":"20160929094000538141"},{"id":536829,"title":"老司机:四轮定位这玩意调不好可危险了","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M13/2D/CB/160x120_0_autohomecar__wKgFU1fgyHqAVrLSAAMHTOtkrMA451.jpg","replycount":239,"pagecount":1,"jumppage":1,"updatetime":"20160920132620","lastid":"20160929090000536829"},{"id":538322,"title":"取悦你的手\u2014\u2014解析换挡器的今生和未来","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0C/3D/D3/160x120_0_autohomecar__wKgFW1frPL-AGBjiAAZyhCSyhwk752.PNG","replycount":205,"pagecount":1,"jumppage":1,"updatetime":"20160928175444","lastid":"20160929073000538322"}]}
     */

    private int returncode;
    private String message;
    /**
     * total : 10621
     * isloadmore : true
     * list : [{"id":535091,"title":"喝BBA锅里的汤，抢CT6和S90L锅里的肉","time":"2016-09-30","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M0A/5F/A4/160x120_0_autohomecar__wKgH3Vfsrn2AQbiyAAD4MpBhw64274.JPG","replycount":166,"pagecount":1,"jumppage":1,"updatetime":"20160930074648","lastid":"20160930074800535091"},{"id":538528,"title":"日系车在欧洲混不下去？","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g20/M04/3E/A3/160x120_0_autohomecar__wKjBw1fs0peAChefAAFGdcjipL0279.jpg","replycount":164,"pagecount":1,"jumppage":1,"updatetime":"20160929163640","lastid":"20160930073000538528"},{"id":537995,"title":"一汽轿车亏了8亿多 都是红旗的错？","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M07/59/A7/160x120_0_autohomecar__wKjBylfo7B6AMPF6AAH3mobaWW8993.jpg","replycount":792,"pagecount":1,"jumppage":1,"updatetime":"20160927092949","lastid":"20160930010100537995"},{"id":538075,"title":"捷达为什么比桑塔纳卖得好?","time":"2016-09-30","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g12/M0B/5B/4A/160x120_0_autohomecar__wKjBy1fp3guASKjPAAO_vQzmk48739.jpg","replycount":358,"pagecount":1,"jumppage":1,"updatetime":"20160927104844","lastid":"20160930000100538075"},{"id":538577,"title":"Top 10经典跑车，哪款是你的菜？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M05/5E/9C/160x120_0_autohomecar__wKgHz1fsu0yAAqVrAB2ilXRtOn4074.jpg","replycount":52,"pagecount":1,"jumppage":1,"updatetime":"20160929150419","lastid":"20160929230000538577"},{"id":538571,"title":"福特Mustang的前世今生","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M03/5E/90/160x120_0_autohomecar__wKgHz1fstS2AT_UZAAI_PlnHj8Q198.jpg","replycount":136,"pagecount":1,"jumppage":1,"updatetime":"20160929230054","lastid":"20160929223000538571"},{"id":538495,"title":"为什么你的车没有自动刹车技能？！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M0D/5F/3D/160x120_0_autohomecar__wKgH3Vfse4OAGw9_AAEDFMDn_Y4893.jpg","replycount":98,"pagecount":1,"jumppage":1,"updatetime":"20160929170322","lastid":"20160929220000538495"},{"id":538323,"title":"喜大普奔or哀鸿遍野 中国车市何去何从","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M14/5E/15/160x120_0_autohomecar__wKgH4VfsbMqALUpiAALK9YxXRr8692.jpg","replycount":230,"pagecount":1,"jumppage":1,"updatetime":"20160929092219","lastid":"20160929213000538323"},{"id":538470,"title":"美媒评出最佳驾驶者之车,榜霸竟是他们","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M01/3E/74/160x120_0_autohomecar__wKjBwVfsc7aAFKuiAADoFRmgPeU650.jpg","replycount":321,"pagecount":1,"jumppage":1,"updatetime":"20160929100813","lastid":"20160929210000538470"},{"id":532118,"title":"关于刹车，真的是力越大就越好用吗？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g14/M07/5F/1C/160x120_0_autohomecar__wKgH5Ffs1iWAHJ_jAAGzgjHY7Uw227.jpg","replycount":167,"pagecount":1,"jumppage":1,"updatetime":"20160929165152","lastid":"20160929203000532118"},{"id":538523,"title":"底盘护板要不要装？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g9/M13/5E/24/160x120_0_autohomecar__wKgH0FfsumWAOYmgAAFstv_n3zM669.jpg","replycount":285,"pagecount":1,"jumppage":1,"updatetime":"20160929145331","lastid":"20160929200000538523"},{"id":537797,"title":"解读特斯拉8.0固件：安全才是核心！","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M0D/58/31/160x120_0_autohomecar__wKgH2lfnn06AJ9moAADma53RXXQ836.jpg","replycount":34,"pagecount":1,"jumppage":1,"updatetime":"20160928154950","lastid":"20160929200000537797"},{"id":538587,"title":"每年仅产50辆 试驾MINI顶级运动小钢炮","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g21/M02/3E/1A/160x120_0_autohomecar__wKjBwlfszjOAMCu_AAFXfdP5NBY400.jpg","replycount":70,"pagecount":1,"jumppage":1,"updatetime":"20160929164552","lastid":"20160929190000538587"},{"id":538516,"title":"众泰SR9、大迈X7迎全新兄弟T700","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M03/5E/A0/160x120_0_autohomecar__wKgH4VfsrvKAeA0PAAJi_67p9Vo041.jpg","replycount":576,"pagecount":1,"jumppage":1,"updatetime":"20160929140435","lastid":"20160929180000538516"},{"id":538594,"title":"进口版配置大曝光 揭秘路虎全新发现5","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M0D/5F/22/160x120_0_autohomecar__wKjBylfs1AmAULG5AAW8PgUwbSk901.jpg","replycount":282,"pagecount":1,"jumppage":1,"updatetime":"20160929172347","lastid":"20160929172000538594"},{"id":537279,"title":"这车用法拉利发动机，却卖着普通车价钱","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M02/4E/33/160x120_0_autohomecar__wKgH51fjSNGAE7axAAiZ4yyR_uI831.jpg","replycount":63,"pagecount":1,"jumppage":1,"updatetime":"20160926110703","lastid":"20160929170000537279"},{"id":538419,"title":"海外媒体怎么评价新雅阁锐混动","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g17/M10/5A/81/160x120_0_autohomecar__wKgH51fsq7CAGLovAAIE4zRru5M659.jpg","replycount":120,"pagecount":1,"jumppage":1,"updatetime":"20160929135041","lastid":"20160929160000538419"},{"id":538442,"title":"大众第十三个品牌，或诞生于江淮大众？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/5E/32/160x120_0_autohomecar__wKjBzFfsvCSAPi2FAAHHnGNtdvU440.jpg","replycount":253,"pagecount":1,"jumppage":1,"updatetime":"20160929150100","lastid":"20160929153000538442"},{"id":538408,"title":"你关注过红绿灯的放行顺序吗？","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M11/5E/3C/160x120_0_autohomecar__wKgH4VfsfAiAL7UjAADVnQxnbdk801.jpg","replycount":247,"pagecount":1,"jumppage":1,"updatetime":"20160929102722","lastid":"20160929150000538408"},{"id":538509,"title":"第三版前脸现身，操碎了心的长安CS95","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M0A/5E/10/160x120_0_autohomecar__wKjBzFfsqx6AKLlgAAKeVSSayv4432.jpg","replycount":751,"pagecount":1,"jumppage":1,"updatetime":"20160929134815","lastid":"20160929143000538509"},{"id":537979,"title":"450万造一台赛车 沃尔沃只为了刷圈速？","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0C/59/F4/160x120_0_autohomecar__wKgH4Ffo37SAJAfCAAF23hxDNX4341.jpg","replycount":169,"pagecount":1,"jumppage":1,"updatetime":"20160927105854","lastid":"20160929140000537979"},{"id":538496,"title":"美国十大畅销豪华SUV 宝马奔驰双入","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g15/M13/5F/05/160x120_0_autohomecar__wKjByFfsgFeAZ5paAAPd9lVepag196.jpg","replycount":287,"pagecount":1,"jumppage":1,"updatetime":"20160929104544","lastid":"20160929130000538496"},{"id":538309,"title":"主打SUV与新能源 巴黎车展概念车大集合","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g23/M15/3E/71/160x120_0_autohomecar__wKjBwFfrkayAHaKIAAHng7GBdrQ085.jpg","replycount":110,"pagecount":1,"jumppage":1,"updatetime":"20160928174726","lastid":"20160929120000538309"},{"id":538422,"title":"1.4T可以期待 聊全新指南者未公开信息","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g15/M0A/5B/C5/160x120_0_autohomecar__wKgH1lfrteWAI0VxAAOTkWU02UI520.jpg","replycount":458,"pagecount":1,"jumppage":1,"updatetime":"20160928213837","lastid":"20160929112000538422"},{"id":538434,"title":"BJ80的印度表亲 \"三哥\"山寨G级怎么样","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M02/5D/3D/160x120_0_autohomecar__wKjBzVfrzLKAcCquAAFGuiCPN6A884.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160929134625","lastid":"20160929104000538434"},{"id":538006,"title":"这辈子一定要开一下自然吸气V12","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0D/3B/CA/160x120_0_autohomecar__wKgFW1fp13OAHH50AAH_W3mVNAI207.jpg","replycount":220,"pagecount":1,"jumppage":1,"updatetime":"20160927103507","lastid":"20160929103000538006"},{"id":538234,"title":"我军历次阅兵检阅用车大巡礼(上篇)","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g9/M0C/55/B8/160x120_0_autohomecar__wKjBzlfqqWeADrIRAAEviAYwGXg390.jpg","replycount":99,"pagecount":1,"jumppage":1,"updatetime":"20160928095022","lastid":"20160929100000538234"},{"id":538141,"title":"快乐比速度更耐人寻味丨约\"炮\"TTS","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M05/3A/A8/160x120_0_autohomecar__wKjBw1fqGeSAQnNtAA0NXTxvRmA243.jpg","replycount":107,"pagecount":1,"jumppage":1,"updatetime":"20160927150455","lastid":"20160929094000538141"},{"id":536829,"title":"老司机:四轮定位这玩意调不好可危险了","time":"2016-09-29","type":"","smallpic":"http://www3.autoimg.cn/newsdfs/g19/M13/2D/CB/160x120_0_autohomecar__wKgFU1fgyHqAVrLSAAMHTOtkrMA451.jpg","replycount":239,"pagecount":1,"jumppage":1,"updatetime":"20160920132620","lastid":"20160929090000536829"},{"id":538322,"title":"取悦你的手\u2014\u2014解析换挡器的今生和未来","time":"2016-09-29","type":"","smallpic":"http://www2.autoimg.cn/newsdfs/g22/M0C/3D/D3/160x120_0_autohomecar__wKgFW1frPL-AGBjiAAZyhCSyhwk752.PNG","replycount":205,"pagecount":1,"jumppage":1,"updatetime":"20160928175444","lastid":"20160929073000538322"}]
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
         * id : 535091
         * title : 喝BBA锅里的汤，抢CT6和S90L锅里的肉
         * time : 2016-09-30
         * type :
         * smallpic : http://www3.autoimg.cn/newsdfs/g7/M0A/5F/A4/160x120_0_autohomecar__wKgH3Vfsrn2AQbiyAAD4MpBhw64274.JPG
         * replycount : 166
         * pagecount : 1
         * jumppage : 1
         * updatetime : 20160930074648
         * lastid : 20160930074800535091
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
