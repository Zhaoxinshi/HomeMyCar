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
 * Created by dllo on 16/9/21.
 */
public class FindEntity {

    /**
     * modulelist : [{"title":"猜你喜欢","list":[{"id":153686,"productid":60001975,"title":"长安之星3","shorttitle":"线上下单支付99元，到店购车享车款再减500元","logo":"http://car3.autoimg.cn/cardfs/product/g18/M09/8B/7F/tp_autohomecar__wKjBxVYE8AiAf2dCAAGXZ6NG6Dc705.jpg","price":"99元","fctprice":"500元","adinfo":"线上下单支付99元，到店购车享车款再减500元","murl":"http://mall.m.autohome.com.cn/item/app/item-60001975-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158818,"productid":60002212,"title":"奥迪A4L","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car3.autoimg.cn/cardfs/product/g17/M0D/14/72/tp_autohomecar__wKgH51Z3aiqAOZJ8AAGdmtdHc6I067.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002212-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":154646,"productid":60002025,"title":"幸运的新\u201c8\u201d-3008试驾有礼","shorttitle":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0E/C1/7D/tp_autohomecar__wKgH41d8wImAQUf-AAGEJ92oXK0504.jpg","price":"1元","fctprice":"68元","adinfo":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","murl":"http://mall.m.autohome.com.cn/item/app/item-60002025-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158839,"productid":60002220,"title":"进口奥迪TT","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car0.autoimg.cn/upload/2014/11/7/tp_20141107192013080-111.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002220-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}},{"title":"为我推荐","list":[{"id":90228,"productid":0,"title":"雪佛兰 科鲁兹 2015款 掀背 1.6L 自动舒适版","shorttitle":"科鲁兹 2015款 掀背 1.6L 自动舒适版","logo":"http://car2.autoimg.cn/cardfs/product/g5/M0E/D8/29/tp_autohomecar__wKgHzFeQl-yAPwNqAAFzbGdGmGE005.jpg","price":"10.59万","fctprice":"12.39万","adinfo":"首付低至20%，60期无忧还款","murl":"http://m.mall.autohome.com.cn/detail/90228-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":103057,"productid":0,"title":"奥迪 奥迪Q7 2016款 汽油版 3.0T 欧规（7座）","shorttitle":"奥迪Q7 2016款 汽油版 3.0T 欧规 黑色","logo":"http://car2.autoimg.cn/cardfs/product/g5/M13/5A/3D/tp_autohomecar__wKjB0lcUmT6ABff6AAENKy8OA9E856.jpg","price":"66.00万","fctprice":"91.80万","adinfo":"【全新的越野体验】白色 奥迪Q7 3.0 TFSI 3.0T 七座汽油版车商城现车直售！实力卖家良心价格！欢迎来梅山体验中心考察","murl":"http://m.mall.autohome.com.cn/detail/103057-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":155716,"productid":0,"title":"宝马 宝马X5 2015款 xDrive28i","shorttitle":"宝马X5 2015款 xDrive28i","logo":"http://car2.autoimg.cn/cardfs/product/g20/M0D/0D/D2/tp_autohomecar__wKgFVFfOfpOAIavNAAFKQ3HprtQ533.jpg","price":"64.80万","fctprice":"75.80万","adinfo":"零首付购车，多种方案选择，优惠车价，4S现货车源","murl":"http://m.mall.autohome.com.cn/detail/155716-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":160145,"productid":0,"title":"别克 昂科拉 2015款 1.4T 自动两驱都市领先型","shorttitle":"昂科拉 2015款 1.4T 自动两驱都市领先型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103193423421-111.jpg","price":"15.99万","fctprice":"16.89万","adinfo":"首付低至20%，60期无忧还款","murl":"http://m.mall.autohome.com.cn/detail/160145-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}}]
     * goodslist : {"list":[{"id":40829,"productid":0,"title":"奇瑞 瑞虎5 2016款 1.5T 手动家悦信赖版","shorttitle":"瑞虎5 2016款 1.5T 手动家悦信赖版","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/0C/87/tp_autohomecar__wKgHzVe6wFqAXofaAAGATma212s595.jpg","price":"9.79万","fctprice":"10.79万","adinfo":"【直降1万元】【1500元限量购车红包】【动力强劲】【发动机10年/100万公里超长延保】【购置税减半】红包使用截止日期「9月30日」欲购从速！早买早提车！","murl":"http://m.mall.autohome.com.cn/detail/40829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":26,"seriesid":3195,"specid":23999,"seriesname":"瑞虎5","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":42729,"productid":0,"title":"北汽幻速 北汽幻速S2 2016款 1.5L 手动幸福版 国IV","shorttitle":"北汽幻速S2 2016款 1.5L 手动幸福版国IV(底价爆抢)","logo":"http://car3.autoimg.cn/cardfs/product/g14/M10/B5/5A/tp_autohomecar__wKjByVYmAHiACBNmAAGZYLZgA2o835.jpg","price":"4.78万","fctprice":"5.38万","adinfo":"直降6000元！全部现车，提车不等待！享购置税减半政策（约再省2000元），送增配礼包（倒车雷达、皮质座椅、发动机装饰罩、点烟器，2个扬声器）。购车送价值1600元美国卓棒音箱。订金金额：2000元","murl":"http://m.mall.autohome.com.cn/detail/42729-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":203,"seriesid":3284,"specid":24225,"seriesname":"北汽幻速S2","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":85630,"productid":0,"title":"标致 标致2008 2015款 玩酷版 1.6L 自动翡翠型","shorttitle":"标致2008 2015款 玩酷版 1.6L 自动翡翠型","logo":"http://car2.autoimg.cn/cardfs/product/g19/M00/24/81/tp_autohomecar__wKjBxFaomLqAG6fdAAFP4CWXoyU364.jpg","price":"10.80万","fctprice":"13.30万","adinfo":"现金直降25000元！发提车精华帖返500元现金！享受国家1.6升及以下购置税减半优惠政策！（订金金额：2000元）","murl":"http://m.mall.autohome.com.cn/detail/85630-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":3234,"specid":24924,"seriesname":"标致2008","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138133,"productid":0,"title":"现代 名图 2016款 1.8L 自动智能型GLS","shorttitle":"名图 2016款 1.8L 自动智能型GLS","logo":"http://car3.autoimg.cn/cardfs/product/g21/M08/34/97/tp_autohomecar__wKgFVVau6saAexsBAAGK7MAzpeg615.jpg","price":"12.78万","fctprice":"14.98万","adinfo":"新店开业，现金直降2.2万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/138133-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":12,"seriesid":3073,"specid":25162,"seriesname":"名图","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133911,"productid":0,"title":"捷豹 捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","shorttitle":"捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0D/11/3F/tp_autohomecar__wKgH1FZw0b-AQAEQAAF9A0oOVCg955.jpg","price":"58.80万","fctprice":"79.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133911-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":44,"seriesid":178,"specid":24767,"seriesname":"捷豹XJ","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":129813,"productid":0,"title":"保时捷 Macan 2017款 Macan 2.0T","shorttitle":"Macan 2017款 Macan 2.0T","logo":"http://car2.autoimg.cn/cardfs/product/g15/M0E/CB/C4/tp_autohomecar__wKjByFeC8qeAXNmVAAFTIQmuDzk786.jpg","price":"55.80万","fctprice":"58.80万","adinfo":"保时捷Macan 2.0T低配车型综合优惠3万，车商城价不含配置费用。","murl":"http://m.mall.autohome.com.cn/detail/129813-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":40,"seriesid":2838,"specid":24733,"seriesname":"Macan","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":142757,"productid":0,"title":"道奇 道奇Ram 公羊长角号2016款","shorttitle":"道奇Ram 2016款 5.7L 长角号自动挡","logo":"http://car0.autoimg.cn/car/upload/2015/3/9/tp_20150309100638755-1110.jpg","price":"51.50万","fctprice":"54.00万","adinfo":"道奇Ram 2016款 5.7L 长角号自动挡，最低515000起，颜色齐全，标配高配配置齐全，大量现车销售，欢迎广大客户咨询！","murl":"http://m.mall.autohome.com.cn/detail/142757-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":41,"seriesid":2198,"specid":11000243,"seriesname":"道奇Ram","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130460,"productid":0,"title":"标致 标致308S 2016款 1.2T 手动尚弛版","shorttitle":"标致308S 2016款 1.2T 手动尚弛版","logo":"http://car0.autoimg.cn/car/upload/2015/6/18/tp_20150618103907954-1112.jpg","price":"12.07万","fctprice":"12.07万","adinfo":"东风标致308S 门店议价 立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近的门店。","murl":"http://m.mall.autohome.com.cn/detail/130460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3632,"specid":24520,"seriesname":"标致308S","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":72599,"productid":0,"title":"广汽传祺 传祺GA3S视界 2014款 1.6L 自动豪华ESP版","shorttitle":"传祺GA3S 1.6L 自动豪华ESP版（国五）","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024165950201-111.jpg","price":"8.48万","fctprice":"9.48万","adinfo":"全新升级18项静音配置，现金直降1万元，国五车型，享受购置税减半政策。","murl":"http://m.mall.autohome.com.cn/detail/72599-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":82,"seriesid":3524,"specid":19815,"seriesname":"传祺GA3S视界","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133844,"productid":0,"title":"路虎 发现神行 2016款 2.0T HSE","shorttitle":"发现神行 2016款 2.0T HSE","logo":"http://car3.autoimg.cn/cardfs/product/g16/M15/D9/F0/tp_autohomecar__wKgH5lZCKryAZ7EcAAGFZaErwvI572.jpg","price":"39.30万","fctprice":"46.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133844-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3871,"specid":24363,"seriesname":"发现神行","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":150215,"productid":0,"title":"哈弗 哈弗H6 2016款 升级版 1.5T 手动两驱都市型","shorttitle":"哈弗H6 2016款 升级版 1.5T 手动两驱都市型","logo":"http://car2.autoimg.cn/cardfs/product/g20/M08/FE/AE/tp_autohomecar__wKjBw1bx_veAGqWcAAFJuqsthXU853.jpg","price":"9.48万","fctprice":"9.48万","adinfo":"花生好车9月订车送2000元大礼包 哈佛H6 0首付月租2193元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150215-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":181,"seriesid":2123,"specid":25652,"seriesname":"哈弗H6","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133854,"productid":0,"title":"路虎 揽胜极光 2016款 2.0T SE 智耀版","shorttitle":"揽胜极光 2016款 2.0T SE 智耀版","logo":"http://car3.autoimg.cn/cardfs/product/g4/M12/D9/F6/tp_autohomecar__wKgH2lZCK1mACA7dAAFlsN9GnAc196.jpg","price":"39.30万","fctprice":"45.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133854-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3521,"specid":26139,"seriesname":"揽胜极光","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133852,"productid":0,"title":"路虎 揽胜 2016款 3.0 V6 SC Vogue","shorttitle":"揽胜 2016款 3.0 V6 SC Vogue","logo":"http://car2.autoimg.cn/cardfs/product/g12/M0E/C2/B1/tp_autohomecar__wKgH4ld8n5eAPDFPAAGPbRsG_QU663.jpg","price":"138.80万","fctprice":"155.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133852-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":49,"seriesid":69,"specid":23989,"seriesname":"揽胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133897,"productid":0,"title":"捷豹 捷豹F-PACE 2016款 2.0T 两驱R-Sport运动版","shorttitle":"捷豹F-PACE 2016款 2.0T R-SPORT运动版","logo":"http://car2.autoimg.cn/cardfs/product/g19/M12/AB/DB/tp_autohomecar__wKgFWFeDCoyAYwj3AAFwcyqv7A8682.jpg","price":"58.30万","fctprice":"62.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133897-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":44,"seriesid":3209,"specid":24627,"seriesname":"捷豹F-PACE","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":127589,"productid":0,"title":"Jeep 大切诺基(进口) 2015款 3.0L 精英导航版","shorttitle":"大切诺基(进口) 2015款 3.0L 精英导航版","logo":"http://car2.autoimg.cn/cardfs/product/g14/M03/C9/F5/tp_autohomecar__wKgH1VeC8hmAY5hCAAGcyPLTG9Y383.jpg","price":"45.80万","fctprice":"60.99万","adinfo":"具体提车城市请联系商铺 以实际全国4s店库存为准\n8.12港口粉尘落灰车 指定4s店提车 空滤已更换 正常质保三年八万公里\n全国上牌","murl":"http://m.mall.autohome.com.cn/detail/127589-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":46,"seriesid":521,"specid":22599,"seriesname":"大切诺基(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"isloadmore":true,"carmallurl":"http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177"}
     * issmartrecommendpvtype : 1
     */

    private ResultBean result;
    /**
     * result : {"modulelist":[{"title":"猜你喜欢","list":[{"id":153686,"productid":60001975,"title":"长安之星3","shorttitle":"线上下单支付99元，到店购车享车款再减500元","logo":"http://car3.autoimg.cn/cardfs/product/g18/M09/8B/7F/tp_autohomecar__wKjBxVYE8AiAf2dCAAGXZ6NG6Dc705.jpg","price":"99元","fctprice":"500元","adinfo":"线上下单支付99元，到店购车享车款再减500元","murl":"http://mall.m.autohome.com.cn/item/app/item-60001975-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158818,"productid":60002212,"title":"奥迪A4L","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car3.autoimg.cn/cardfs/product/g17/M0D/14/72/tp_autohomecar__wKgH51Z3aiqAOZJ8AAGdmtdHc6I067.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002212-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":154646,"productid":60002025,"title":"幸运的新\u201c8\u201d-3008试驾有礼","shorttitle":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0E/C1/7D/tp_autohomecar__wKgH41d8wImAQUf-AAGEJ92oXK0504.jpg","price":"1元","fctprice":"68元","adinfo":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","murl":"http://mall.m.autohome.com.cn/item/app/item-60002025-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158839,"productid":60002220,"title":"进口奥迪TT","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car0.autoimg.cn/upload/2014/11/7/tp_20141107192013080-111.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002220-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}},{"title":"为我推荐","list":[{"id":90228,"productid":0,"title":"雪佛兰 科鲁兹 2015款 掀背 1.6L 自动舒适版","shorttitle":"科鲁兹 2015款 掀背 1.6L 自动舒适版","logo":"http://car2.autoimg.cn/cardfs/product/g5/M0E/D8/29/tp_autohomecar__wKgHzFeQl-yAPwNqAAFzbGdGmGE005.jpg","price":"10.59万","fctprice":"12.39万","adinfo":"首付低至20%，60期无忧还款","murl":"http://m.mall.autohome.com.cn/detail/90228-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":103057,"productid":0,"title":"奥迪 奥迪Q7 2016款 汽油版 3.0T 欧规（7座）","shorttitle":"奥迪Q7 2016款 汽油版 3.0T 欧规 黑色","logo":"http://car2.autoimg.cn/cardfs/product/g5/M13/5A/3D/tp_autohomecar__wKjB0lcUmT6ABff6AAENKy8OA9E856.jpg","price":"66.00万","fctprice":"91.80万","adinfo":"【全新的越野体验】白色 奥迪Q7 3.0 TFSI 3.0T 七座汽油版车商城现车直售！实力卖家良心价格！欢迎来梅山体验中心考察","murl":"http://m.mall.autohome.com.cn/detail/103057-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":155716,"productid":0,"title":"宝马 宝马X5 2015款 xDrive28i","shorttitle":"宝马X5 2015款 xDrive28i","logo":"http://car2.autoimg.cn/cardfs/product/g20/M0D/0D/D2/tp_autohomecar__wKgFVFfOfpOAIavNAAFKQ3HprtQ533.jpg","price":"64.80万","fctprice":"75.80万","adinfo":"零首付购车，多种方案选择，优惠车价，4S现货车源","murl":"http://m.mall.autohome.com.cn/detail/155716-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":160145,"productid":0,"title":"别克 昂科拉 2015款 1.4T 自动两驱都市领先型","shorttitle":"昂科拉 2015款 1.4T 自动两驱都市领先型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103193423421-111.jpg","price":"15.99万","fctprice":"16.89万","adinfo":"首付低至20%，60期无忧还款","murl":"http://m.mall.autohome.com.cn/detail/160145-210200-0.html?isapp=1#pvareaid=2018163","functionid":0,"type":0,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"spread":{"bannerimg":"","detailurl":"","spreadid":0}}],"goodslist":{"list":[{"id":40829,"productid":0,"title":"奇瑞 瑞虎5 2016款 1.5T 手动家悦信赖版","shorttitle":"瑞虎5 2016款 1.5T 手动家悦信赖版","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/0C/87/tp_autohomecar__wKgHzVe6wFqAXofaAAGATma212s595.jpg","price":"9.79万","fctprice":"10.79万","adinfo":"【直降1万元】【1500元限量购车红包】【动力强劲】【发动机10年/100万公里超长延保】【购置税减半】红包使用截止日期「9月30日」欲购从速！早买早提车！","murl":"http://m.mall.autohome.com.cn/detail/40829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":26,"seriesid":3195,"specid":23999,"seriesname":"瑞虎5","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":42729,"productid":0,"title":"北汽幻速 北汽幻速S2 2016款 1.5L 手动幸福版 国IV","shorttitle":"北汽幻速S2 2016款 1.5L 手动幸福版国IV(底价爆抢)","logo":"http://car3.autoimg.cn/cardfs/product/g14/M10/B5/5A/tp_autohomecar__wKjByVYmAHiACBNmAAGZYLZgA2o835.jpg","price":"4.78万","fctprice":"5.38万","adinfo":"直降6000元！全部现车，提车不等待！享购置税减半政策（约再省2000元），送增配礼包（倒车雷达、皮质座椅、发动机装饰罩、点烟器，2个扬声器）。购车送价值1600元美国卓棒音箱。订金金额：2000元","murl":"http://m.mall.autohome.com.cn/detail/42729-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":203,"seriesid":3284,"specid":24225,"seriesname":"北汽幻速S2","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":85630,"productid":0,"title":"标致 标致2008 2015款 玩酷版 1.6L 自动翡翠型","shorttitle":"标致2008 2015款 玩酷版 1.6L 自动翡翠型","logo":"http://car2.autoimg.cn/cardfs/product/g19/M00/24/81/tp_autohomecar__wKjBxFaomLqAG6fdAAFP4CWXoyU364.jpg","price":"10.80万","fctprice":"13.30万","adinfo":"现金直降25000元！发提车精华帖返500元现金！享受国家1.6升及以下购置税减半优惠政策！（订金金额：2000元）","murl":"http://m.mall.autohome.com.cn/detail/85630-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":3234,"specid":24924,"seriesname":"标致2008","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138133,"productid":0,"title":"现代 名图 2016款 1.8L 自动智能型GLS","shorttitle":"名图 2016款 1.8L 自动智能型GLS","logo":"http://car3.autoimg.cn/cardfs/product/g21/M08/34/97/tp_autohomecar__wKgFVVau6saAexsBAAGK7MAzpeg615.jpg","price":"12.78万","fctprice":"14.98万","adinfo":"新店开业，现金直降2.2万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/138133-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":12,"seriesid":3073,"specid":25162,"seriesname":"名图","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133911,"productid":0,"title":"捷豹 捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","shorttitle":"捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0D/11/3F/tp_autohomecar__wKgH1FZw0b-AQAEQAAF9A0oOVCg955.jpg","price":"58.80万","fctprice":"79.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133911-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":44,"seriesid":178,"specid":24767,"seriesname":"捷豹XJ","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":129813,"productid":0,"title":"保时捷 Macan 2017款 Macan 2.0T","shorttitle":"Macan 2017款 Macan 2.0T","logo":"http://car2.autoimg.cn/cardfs/product/g15/M0E/CB/C4/tp_autohomecar__wKjByFeC8qeAXNmVAAFTIQmuDzk786.jpg","price":"55.80万","fctprice":"58.80万","adinfo":"保时捷Macan 2.0T低配车型综合优惠3万，车商城价不含配置费用。","murl":"http://m.mall.autohome.com.cn/detail/129813-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":40,"seriesid":2838,"specid":24733,"seriesname":"Macan","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":142757,"productid":0,"title":"道奇 道奇Ram 公羊长角号2016款","shorttitle":"道奇Ram 2016款 5.7L 长角号自动挡","logo":"http://car0.autoimg.cn/car/upload/2015/3/9/tp_20150309100638755-1110.jpg","price":"51.50万","fctprice":"54.00万","adinfo":"道奇Ram 2016款 5.7L 长角号自动挡，最低515000起，颜色齐全，标配高配配置齐全，大量现车销售，欢迎广大客户咨询！","murl":"http://m.mall.autohome.com.cn/detail/142757-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":41,"seriesid":2198,"specid":11000243,"seriesname":"道奇Ram","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130460,"productid":0,"title":"标致 标致308S 2016款 1.2T 手动尚弛版","shorttitle":"标致308S 2016款 1.2T 手动尚弛版","logo":"http://car0.autoimg.cn/car/upload/2015/6/18/tp_20150618103907954-1112.jpg","price":"12.07万","fctprice":"12.07万","adinfo":"东风标致308S 门店议价 立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近的门店。","murl":"http://m.mall.autohome.com.cn/detail/130460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3632,"specid":24520,"seriesname":"标致308S","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":72599,"productid":0,"title":"广汽传祺 传祺GA3S视界 2014款 1.6L 自动豪华ESP版","shorttitle":"传祺GA3S 1.6L 自动豪华ESP版（国五）","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024165950201-111.jpg","price":"8.48万","fctprice":"9.48万","adinfo":"全新升级18项静音配置，现金直降1万元，国五车型，享受购置税减半政策。","murl":"http://m.mall.autohome.com.cn/detail/72599-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":82,"seriesid":3524,"specid":19815,"seriesname":"传祺GA3S视界","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133844,"productid":0,"title":"路虎 发现神行 2016款 2.0T HSE","shorttitle":"发现神行 2016款 2.0T HSE","logo":"http://car3.autoimg.cn/cardfs/product/g16/M15/D9/F0/tp_autohomecar__wKgH5lZCKryAZ7EcAAGFZaErwvI572.jpg","price":"39.30万","fctprice":"46.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133844-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3871,"specid":24363,"seriesname":"发现神行","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":150215,"productid":0,"title":"哈弗 哈弗H6 2016款 升级版 1.5T 手动两驱都市型","shorttitle":"哈弗H6 2016款 升级版 1.5T 手动两驱都市型","logo":"http://car2.autoimg.cn/cardfs/product/g20/M08/FE/AE/tp_autohomecar__wKjBw1bx_veAGqWcAAFJuqsthXU853.jpg","price":"9.48万","fctprice":"9.48万","adinfo":"花生好车9月订车送2000元大礼包 哈佛H6 0首付月租2193元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150215-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":181,"seriesid":2123,"specid":25652,"seriesname":"哈弗H6","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133854,"productid":0,"title":"路虎 揽胜极光 2016款 2.0T SE 智耀版","shorttitle":"揽胜极光 2016款 2.0T SE 智耀版","logo":"http://car3.autoimg.cn/cardfs/product/g4/M12/D9/F6/tp_autohomecar__wKgH2lZCK1mACA7dAAFlsN9GnAc196.jpg","price":"39.30万","fctprice":"45.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133854-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3521,"specid":26139,"seriesname":"揽胜极光","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133852,"productid":0,"title":"路虎 揽胜 2016款 3.0 V6 SC Vogue","shorttitle":"揽胜 2016款 3.0 V6 SC Vogue","logo":"http://car2.autoimg.cn/cardfs/product/g12/M0E/C2/B1/tp_autohomecar__wKgH4ld8n5eAPDFPAAGPbRsG_QU663.jpg","price":"138.80万","fctprice":"155.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133852-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":49,"seriesid":69,"specid":23989,"seriesname":"揽胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133897,"productid":0,"title":"捷豹 捷豹F-PACE 2016款 2.0T 两驱R-Sport运动版","shorttitle":"捷豹F-PACE 2016款 2.0T R-SPORT运动版","logo":"http://car2.autoimg.cn/cardfs/product/g19/M12/AB/DB/tp_autohomecar__wKgFWFeDCoyAYwj3AAFwcyqv7A8682.jpg","price":"58.30万","fctprice":"62.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133897-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":44,"seriesid":3209,"specid":24627,"seriesname":"捷豹F-PACE","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":127589,"productid":0,"title":"Jeep 大切诺基(进口) 2015款 3.0L 精英导航版","shorttitle":"大切诺基(进口) 2015款 3.0L 精英导航版","logo":"http://car2.autoimg.cn/cardfs/product/g14/M03/C9/F5/tp_autohomecar__wKgH1VeC8hmAY5hCAAGcyPLTG9Y383.jpg","price":"45.80万","fctprice":"60.99万","adinfo":"具体提车城市请联系商铺 以实际全国4s店库存为准\n8.12港口粉尘落灰车 指定4s店提车 空滤已更换 正常质保三年八万公里\n全国上牌","murl":"http://m.mall.autohome.com.cn/detail/127589-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":46,"seriesid":521,"specid":22599,"seriesname":"大切诺基(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}],"isloadmore":true,"carmallurl":"http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177"},"issmartrecommendpvtype":1}
     * returncode : 0
     * message :
     */

    private int returncode;
    private String message;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

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

    public static class ResultBean {
        /**
         * list : [{"id":40829,"productid":0,"title":"奇瑞 瑞虎5 2016款 1.5T 手动家悦信赖版","shorttitle":"瑞虎5 2016款 1.5T 手动家悦信赖版","logo":"http://car3.autoimg.cn/cardfs/product/g6/M07/0C/87/tp_autohomecar__wKgHzVe6wFqAXofaAAGATma212s595.jpg","price":"9.79万","fctprice":"10.79万","adinfo":"【直降1万元】【1500元限量购车红包】【动力强劲】【发动机10年/100万公里超长延保】【购置税减半】红包使用截止日期「9月30日」欲购从速！早买早提车！","murl":"http://m.mall.autohome.com.cn/detail/40829-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":26,"seriesid":3195,"specid":23999,"seriesname":"瑞虎5","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":42729,"productid":0,"title":"北汽幻速 北汽幻速S2 2016款 1.5L 手动幸福版 国IV","shorttitle":"北汽幻速S2 2016款 1.5L 手动幸福版国IV(底价爆抢)","logo":"http://car3.autoimg.cn/cardfs/product/g14/M10/B5/5A/tp_autohomecar__wKjByVYmAHiACBNmAAGZYLZgA2o835.jpg","price":"4.78万","fctprice":"5.38万","adinfo":"直降6000元！全部现车，提车不等待！享购置税减半政策（约再省2000元），送增配礼包（倒车雷达、皮质座椅、发动机装饰罩、点烟器，2个扬声器）。购车送价值1600元美国卓棒音箱。订金金额：2000元","murl":"http://m.mall.autohome.com.cn/detail/42729-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":203,"seriesid":3284,"specid":24225,"seriesname":"北汽幻速S2","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":85630,"productid":0,"title":"标致 标致2008 2015款 玩酷版 1.6L 自动翡翠型","shorttitle":"标致2008 2015款 玩酷版 1.6L 自动翡翠型","logo":"http://car2.autoimg.cn/cardfs/product/g19/M00/24/81/tp_autohomecar__wKjBxFaomLqAG6fdAAFP4CWXoyU364.jpg","price":"10.80万","fctprice":"13.30万","adinfo":"现金直降25000元！发提车精华帖返500元现金！享受国家1.6升及以下购置税减半优惠政策！（订金金额：2000元）","murl":"http://m.mall.autohome.com.cn/detail/85630-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":3234,"specid":24924,"seriesname":"标致2008","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138683,"productid":0,"title":"标致 标致4008(进口) 2013款 2.0L 两驱时尚型","shorttitle":"标致4008(进口) 2013款 2.0L 两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106142726389-110.jpg","price":"15.78万","fctprice":"21.98万","adinfo":"进口4008 优惠6.4万 可分期购车（0首付） 新车有限，售完为止！ 有现车","murl":"http://m.mall.autohome.com.cn/detail/138683-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":13,"seriesid":2472,"specid":15934,"seriesname":"标致4008(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":136778,"productid":0,"title":"铃木 吉姆尼(进口) 2015款 1.3L 自动挡 中东版","shorttitle":"吉姆尼(进口) 2015款 1.3L 自动挡 中东版","logo":"http://car2.autoimg.cn/cardfs/product/g12/M06/C1/02/tp_autohomecar__wKgH4lYt33OATUjVAAG7fik8y0U459.jpg","price":"12.99万","fctprice":"14.88万","adinfo":"最便宜的平行进口车，最强越野小钢炮。仅售12.99万，颜色不多预购从速！","murl":"http://m.mall.autohome.com.cn/detail/136778-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":53,"seriesid":508,"specid":11000076,"seriesname":"吉姆尼(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":138133,"productid":0,"title":"现代 名图 2016款 1.8L 自动智能型GLS","shorttitle":"名图 2016款 1.8L 自动智能型GLS","logo":"http://car3.autoimg.cn/cardfs/product/g21/M08/34/97/tp_autohomecar__wKgFVVau6saAexsBAAGK7MAzpeg615.jpg","price":"12.78万","fctprice":"14.98万","adinfo":"新店开业，现金直降2.2万元，享两年免息，还送提车大礼包（整车车衣，冰丝脚垫，除味炭包，车用香水）","murl":"http://m.mall.autohome.com.cn/detail/138133-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":12,"seriesid":3073,"specid":25162,"seriesname":"名图","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133911,"productid":0,"title":"捷豹 捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","shorttitle":"捷豹XJ 2016款 XJL 2.0T 两驱典雅商务版","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0D/11/3F/tp_autohomecar__wKgH1FZw0b-AQAEQAAF9A0oOVCg955.jpg","price":"58.80万","fctprice":"79.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133911-210200-0.html?isapp=1#pvareaid=2018162","carlable":"热卖","state":"现货充足","brandid":44,"seriesid":178,"specid":24767,"seriesname":"捷豹XJ","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":129813,"productid":0,"title":"保时捷 Macan 2017款 Macan 2.0T","shorttitle":"Macan 2017款 Macan 2.0T","logo":"http://car2.autoimg.cn/cardfs/product/g15/M0E/CB/C4/tp_autohomecar__wKjByFeC8qeAXNmVAAFTIQmuDzk786.jpg","price":"55.80万","fctprice":"58.80万","adinfo":"保时捷Macan 2.0T低配车型综合优惠3万，车商城价不含配置费用。","murl":"http://m.mall.autohome.com.cn/detail/129813-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":40,"seriesid":2838,"specid":24733,"seriesname":"Macan","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":142757,"productid":0,"title":"道奇 道奇Ram 公羊长角号2016款","shorttitle":"道奇Ram 2016款 5.7L 长角号自动挡","logo":"http://car0.autoimg.cn/car/upload/2015/3/9/tp_20150309100638755-1110.jpg","price":"51.50万","fctprice":"54.00万","adinfo":"道奇Ram 2016款 5.7L 长角号自动挡，最低515000起，颜色齐全，标配高配配置齐全，大量现车销售，欢迎广大客户咨询！","murl":"http://m.mall.autohome.com.cn/detail/142757-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":41,"seriesid":2198,"specid":11000243,"seriesname":"道奇Ram","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130460,"productid":0,"title":"标致 标致308S 2016款 1.2T 手动尚弛版","shorttitle":"标致308S 2016款 1.2T 手动尚弛版","logo":"http://car0.autoimg.cn/car/upload/2015/6/18/tp_20150618103907954-1112.jpg","price":"12.07万","fctprice":"12.07万","adinfo":"东风标致308S 门店议价 立即预订！ 具体车型颜色和配置以当地门店现车为准，线上订金抵扣车款，门店议价，详情咨询就近的门店。","murl":"http://m.mall.autohome.com.cn/detail/130460-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":13,"seriesid":3632,"specid":24520,"seriesname":"标致308S","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":72599,"productid":0,"title":"广汽传祺 传祺GA3S视界 2014款 1.6L 自动豪华ESP版","shorttitle":"传祺GA3S 1.6L 自动豪华ESP版（国五）","logo":"http://car0.autoimg.cn/upload/2014/10/24/tp_20141024165950201-111.jpg","price":"8.48万","fctprice":"9.48万","adinfo":"全新升级18项静音配置，现金直降1万元，国五车型，享受购置税减半政策。","murl":"http://m.mall.autohome.com.cn/detail/72599-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":82,"seriesid":3524,"specid":19815,"seriesname":"传祺GA3S视界","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133844,"productid":0,"title":"路虎 发现神行 2016款 2.0T HSE","shorttitle":"发现神行 2016款 2.0T HSE","logo":"http://car3.autoimg.cn/cardfs/product/g16/M15/D9/F0/tp_autohomecar__wKgH5lZCKryAZ7EcAAGFZaErwvI572.jpg","price":"39.30万","fctprice":"46.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133844-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3871,"specid":24363,"seriesname":"发现神行","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":150215,"productid":0,"title":"哈弗 哈弗H6 2016款 升级版 1.5T 手动两驱都市型","shorttitle":"哈弗H6 2016款 升级版 1.5T 手动两驱都市型","logo":"http://car2.autoimg.cn/cardfs/product/g20/M08/FE/AE/tp_autohomecar__wKjBw1bx_veAGqWcAAFJuqsthXU853.jpg","price":"9.48万","fctprice":"9.48万","adinfo":"花生好车9月订车送2000元大礼包 哈佛H6 0首付月租2193元起 线上支付99元订金 线下完成交易 实际车款以城市店系统金额为准","murl":"http://m.mall.autohome.com.cn/detail/150215-210200-0.html?isapp=1#pvareaid=2018162","carlable":"特价","state":"现货充足","brandid":181,"seriesid":2123,"specid":25652,"seriesname":"哈弗H6","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133854,"productid":0,"title":"路虎 揽胜极光 2016款 2.0T SE 智耀版","shorttitle":"揽胜极光 2016款 2.0T SE 智耀版","logo":"http://car3.autoimg.cn/cardfs/product/g4/M12/D9/F6/tp_autohomecar__wKgH2lZCK1mACA7dAAFlsN9GnAc196.jpg","price":"39.30万","fctprice":"45.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133854-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":49,"seriesid":3521,"specid":26139,"seriesname":"揽胜极光","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":102363,"productid":0,"title":"丰田 坦途 2016款 5.7L SR5TRD版","shorttitle":"坦途 2016款 5.7L SR5TRD版","logo":"http://car3.autoimg.cn/cardfs/product/g22/M0F/35/98/tp_autohomecar__wKjBwVcMto-AaWvFAAFzvvgcqko702.jpg","price":"44.80万","fctprice":"44.60万","adinfo":"【蓝色 橙色现车】丰田 坦途 2016款 5.7L SR5TRD版","murl":"http://m.mall.autohome.com.cn/detail/102363-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"现货充足","brandid":3,"seriesid":2354,"specid":11000103,"seriesname":"坦途","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133852,"productid":0,"title":"路虎 揽胜 2016款 3.0 V6 SC Vogue","shorttitle":"揽胜 2016款 3.0 V6 SC Vogue","logo":"http://car2.autoimg.cn/cardfs/product/g12/M0E/C2/B1/tp_autohomecar__wKgH4ld8n5eAPDFPAAGPbRsG_QU663.jpg","price":"138.80万","fctprice":"155.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133852-210200-0.html?isapp=1#pvareaid=2018162","carlable":"人气","state":"现货充足","brandid":49,"seriesid":69,"specid":23989,"seriesname":"揽胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":133897,"productid":0,"title":"捷豹 捷豹F-PACE 2016款 2.0T 两驱R-Sport运动版","shorttitle":"捷豹F-PACE 2016款 2.0T R-SPORT运动版","logo":"http://car2.autoimg.cn/cardfs/product/g19/M12/AB/DB/tp_autohomecar__wKgFWFeDCoyAYwj3AAFwcyqv7A8682.jpg","price":"58.30万","fctprice":"62.80万","adinfo":"捷豹路虎车型： 可销售全国各地 无区域限制 可享受全国联保 颜色齐全 现车充足 汽车之家车商城来订购...","murl":"http://m.mall.autohome.com.cn/detail/133897-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":44,"seriesid":3209,"specid":24627,"seriesname":"捷豹F-PACE","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":126637,"productid":0,"title":"现代 途胜 2013款 2.0L 手动两驱时尚型","shorttitle":"途胜 2013款 2.0L 手动两驱时尚型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103202208533-110.jpg","price":"10.50万","fctprice":"16.98万","adinfo":"开业大酬宾，多重好礼送不停","murl":"http://m.mall.autohome.com.cn/detail/126637-210200-0.html?isapp=1#pvareaid=2018162","carlable":"爆款","state":"现货充足","brandid":12,"seriesid":358,"specid":15163,"seriesname":"途胜","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":130394,"productid":0,"title":"奔驰 奔驰S级 2014款 S 320 L 商务型","shorttitle":"奔驰S级 2014款 S 320 L 商务型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103185026735-111.jpg","price":"78.80万","fctprice":"93.80万","adinfo":"2016款奔驰S320商务型（2014款奔驰S320+香氛系统）展厅6台现车，现车直降15万！","murl":"http://m.mall.autohome.com.cn/detail/130394-210200-0.html?isapp=1#pvareaid=2018162","carlable":"新品","state":"现货充足","brandid":36,"seriesid":59,"specid":19246,"seriesname":"奔驰S级","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":127589,"productid":0,"title":"Jeep 大切诺基(进口) 2015款 3.0L 精英导航版","shorttitle":"大切诺基(进口) 2015款 3.0L 精英导航版","logo":"http://car2.autoimg.cn/cardfs/product/g14/M03/C9/F5/tp_autohomecar__wKgH1VeC8hmAY5hCAAGcyPLTG9Y383.jpg","price":"45.80万","fctprice":"60.99万","adinfo":"具体提车城市请联系商铺 以实际全国4s店库存为准\n8.12港口粉尘落灰车 指定4s店提车 空滤已更换 正常质保三年八万公里\n全国上牌","murl":"http://m.mall.autohome.com.cn/detail/127589-210200-0.html?isapp=1#pvareaid=2018162","carlable":"","state":"库存紧张","brandid":46,"seriesid":521,"specid":22599,"seriesname":"大切诺基(进口)","count":0,"type":0,"ishistory":false,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}]
         * isloadmore : true
         * carmallurl : http://m.mall.autohome.com.cn/?isapp=1#pvareaid=2018177
         */

        private GoodslistBean goodslist;
        private int issmartrecommendpvtype;
        /**
         * title : 猜你喜欢
         * list : [{"id":153686,"productid":60001975,"title":"长安之星3","shorttitle":"线上下单支付99元，到店购车享车款再减500元","logo":"http://car3.autoimg.cn/cardfs/product/g18/M09/8B/7F/tp_autohomecar__wKjBxVYE8AiAf2dCAAGXZ6NG6Dc705.jpg","price":"99元","fctprice":"500元","adinfo":"线上下单支付99元，到店购车享车款再减500元","murl":"http://mall.m.autohome.com.cn/item/app/item-60001975-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158818,"productid":60002212,"title":"奥迪A4L","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car3.autoimg.cn/cardfs/product/g17/M0D/14/72/tp_autohomecar__wKgH51Z3aiqAOZJ8AAGdmtdHc6I067.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002212-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":154646,"productid":60002025,"title":"幸运的新\u201c8\u201d-3008试驾有礼","shorttitle":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","logo":"http://car3.autoimg.cn/cardfs/product/g13/M0E/C1/7D/tp_autohomecar__wKgH41d8wImAQUf-AAGEJ92oXK0504.jpg","price":"1元","fctprice":"68元","adinfo":"每日10点起秒杀，第8个，第18个订单，可获赠千元油卡购车好礼","murl":"http://mall.m.autohome.com.cn/item/app/item-60002025-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0},{"id":158839,"productid":60002220,"title":"进口奥迪TT","shorttitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","logo":"http://car0.autoimg.cn/upload/2014/11/7/tp_20141107192013080-111.jpg","price":"1元","fctprice":"100元","adinfo":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","murl":"http://mall.m.autohome.com.cn/item/app/item-60002220-0.html#pvareaid=2018163","functionid":0,"type":1,"pvid":"NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN","isoperation":0}]
         * spread : {"bannerimg":"","detailurl":"","spreadid":0}
         */

        private List<ModulelistBean> modulelist;

        public GoodslistBean getGoodslist() {
            return goodslist;
        }

        public void setGoodslist(GoodslistBean goodslist) {
            this.goodslist = goodslist;
        }

        public int getIssmartrecommendpvtype() {
            return issmartrecommendpvtype;
        }

        public void setIssmartrecommendpvtype(int issmartrecommendpvtype) {
            this.issmartrecommendpvtype = issmartrecommendpvtype;
        }

        public List<ModulelistBean> getModulelist() {
            return modulelist;
        }

        public void setModulelist(List<ModulelistBean> modulelist) {
            this.modulelist = modulelist;
        }

        public static class GoodslistBean {
            private boolean isloadmore;
            private String carmallurl;
            /**
             * id : 40829
             * productid : 0
             * title : 奇瑞 瑞虎5 2016款 1.5T 手动家悦信赖版
             * shorttitle : 瑞虎5 2016款 1.5T 手动家悦信赖版
             * logo : http://car3.autoimg.cn/cardfs/product/g6/M07/0C/87/tp_autohomecar__wKgHzVe6wFqAXofaAAGATma212s595.jpg
             * price : 9.79万
             * fctprice : 10.79万
             * adinfo : 【直降1万元】【1500元限量购车红包】【动力强劲】【发动机10年/100万公里超长延保】【购置税减半】红包使用截止日期「9月30日」欲购从速！早买早提车！
             * murl : http://m.mall.autohome.com.cn/detail/40829-210200-0.html?isapp=1#pvareaid=2018162
             * carlable : 热卖
             * state : 现货充足
             * brandid : 26
             * seriesid : 3195
             * specid : 23999
             * seriesname : 瑞虎5
             * count : 0
             * type : 0
             * ishistory : false
             * pvid : NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN
             * isoperation : 0
             */

            private List<ListBean> list;

            public boolean isIsloadmore() {
                return isloadmore;
            }

            public void setIsloadmore(boolean isloadmore) {
                this.isloadmore = isloadmore;
            }

            public String getCarmallurl() {
                return carmallurl;
            }

            public void setCarmallurl(String carmallurl) {
                this.carmallurl = carmallurl;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private int id;
                private int productid;
                private String title;
                private String shorttitle;
                private String logo;
                private String price;
                private String fctprice;
                private String adinfo;
                private String murl;
                private String carlable;
                private String state;
                private int brandid;
                private int seriesid;
                private int specid;
                private String seriesname;
                private int count;
                private int type;
                private boolean ishistory;
                private String pvid;
                private int isoperation;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getProductid() {
                    return productid;
                }

                public void setProductid(int productid) {
                    this.productid = productid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getShorttitle() {
                    return shorttitle;
                }

                public void setShorttitle(String shorttitle) {
                    this.shorttitle = shorttitle;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getFctprice() {
                    return fctprice;
                }

                public void setFctprice(String fctprice) {
                    this.fctprice = fctprice;
                }

                public String getAdinfo() {
                    return adinfo;
                }

                public void setAdinfo(String adinfo) {
                    this.adinfo = adinfo;
                }

                public String getMurl() {
                    return murl;
                }

                public void setMurl(String murl) {
                    this.murl = murl;
                }

                public String getCarlable() {
                    return carlable;
                }

                public void setCarlable(String carlable) {
                    this.carlable = carlable;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getBrandid() {
                    return brandid;
                }

                public void setBrandid(int brandid) {
                    this.brandid = brandid;
                }

                public int getSeriesid() {
                    return seriesid;
                }

                public void setSeriesid(int seriesid) {
                    this.seriesid = seriesid;
                }

                public int getSpecid() {
                    return specid;
                }

                public void setSpecid(int specid) {
                    this.specid = specid;
                }

                public String getSeriesname() {
                    return seriesname;
                }

                public void setSeriesname(String seriesname) {
                    this.seriesname = seriesname;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public boolean isIshistory() {
                    return ishistory;
                }

                public void setIshistory(boolean ishistory) {
                    this.ishistory = ishistory;
                }

                public String getPvid() {
                    return pvid;
                }

                public void setPvid(String pvid) {
                    this.pvid = pvid;
                }

                public int getIsoperation() {
                    return isoperation;
                }

                public void setIsoperation(int isoperation) {
                    this.isoperation = isoperation;
                }
            }
        }

        public static class ModulelistBean {
            private String title;
            /**
             * bannerimg :
             * detailurl :
             * spreadid : 0
             */

            private SpreadBean spread;
            /**
             * id : 153686
             * productid : 60001975
             * title : 长安之星3
             * shorttitle : 线上下单支付99元，到店购车享车款再减500元
             * logo : http://car3.autoimg.cn/cardfs/product/g18/M09/8B/7F/tp_autohomecar__wKjBxVYE8AiAf2dCAAGXZ6NG6Dc705.jpg
             * price : 99元
             * fctprice : 500元
             * adinfo : 线上下单支付99元，到店购车享车款再减500元
             * murl : http://mall.m.autohome.com.cn/item/app/item-60001975-0.html#pvareaid=2018163
             * functionid : 0
             * type : 1
             * pvid : NC6iU7d4kErRdngkkXO1tMvcW4dG0yAN
             * isoperation : 0
             */

            private List<ListBean> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public SpreadBean getSpread() {
                return spread;
            }

            public void setSpread(SpreadBean spread) {
                this.spread = spread;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class SpreadBean {
                private String bannerimg;
                private String detailurl;
                private int spreadid;

                public String getBannerimg() {
                    return bannerimg;
                }

                public void setBannerimg(String bannerimg) {
                    this.bannerimg = bannerimg;
                }

                public String getDetailurl() {
                    return detailurl;
                }

                public void setDetailurl(String detailurl) {
                    this.detailurl = detailurl;
                }

                public int getSpreadid() {
                    return spreadid;
                }

                public void setSpreadid(int spreadid) {
                    this.spreadid = spreadid;
                }
            }

            public static class ListBean {
                private int id;
                private int productid;
                private String title;
                private String shorttitle;
                private String logo;
                private String price;
                private String fctprice;
                private String adinfo;
                private String murl;
                private int functionid;
                private int type;
                private String pvid;
                private int isoperation;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getProductid() {
                    return productid;
                }

                public void setProductid(int productid) {
                    this.productid = productid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getShorttitle() {
                    return shorttitle;
                }

                public void setShorttitle(String shorttitle) {
                    this.shorttitle = shorttitle;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getFctprice() {
                    return fctprice;
                }

                public void setFctprice(String fctprice) {
                    this.fctprice = fctprice;
                }

                public String getAdinfo() {
                    return adinfo;
                }

                public void setAdinfo(String adinfo) {
                    this.adinfo = adinfo;
                }

                public String getMurl() {
                    return murl;
                }

                public void setMurl(String murl) {
                    this.murl = murl;
                }

                public int getFunctionid() {
                    return functionid;
                }

                public void setFunctionid(int functionid) {
                    this.functionid = functionid;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getPvid() {
                    return pvid;
                }

                public void setPvid(String pvid) {
                    this.pvid = pvid;
                }

                public int getIsoperation() {
                    return isoperation;
                }

                public void setIsoperation(int isoperation) {
                    this.isoperation = isoperation;
                }
            }
        }
    }
}
