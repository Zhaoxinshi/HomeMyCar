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
 * Created by dllo on 16/9/23.
 */
public class FindAllEntity {

    /**
     * returncode : 0
     * message :
     * result : {"cardlist":[{"data":[{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M0A/6B/9D/autohomecar__wKjByVf5zi2AZiTuAAJSWSnupas591.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.1111.autohome.com.cn%2f%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g17/M07/64/A4/autohomecar__wKgH2Ff6DOaAFQkPAALRjkIock4362.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f9%2f930%2f%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g23/M06/4A/81/autohomecar__wKgFV1f6EU2ALX9UAACur81xd_A596.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fhd.j.autohome.com.cn%2floan%2floan%2fsqty%3ftype%3dty%23pvareaid%3d106574"},{"imageurl":"http://app2.autoimg.cn/appdfs/g7/M0D/68/E2/autohomecar__wKgHzlf58h2AEZtVAAJTMu2PiLQ326.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f9%2fgcj%2f%3fisapp%3d1%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g16/M09/6D/BB/autohomecar__wKgH5lf57oOAX4zlAAGMH86kYkw614.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f10%2fxdyd%2f%23pvareaid%3d104735"}],"cardtype":"-1","datasource":6,"description":"焦点图"},{"data":[{"imageurl":"http://app2.autoimg.cn/appdfs/g15/M09/4E/25/autohomecar__wKjByFffVLqAEBSUAAAN7Cy0X4g378.png","title":"汽车音频","link":"","id":13},{"imageurl":"http://app2.autoimg.cn/appdfs/g15/M02/4E/27/autohomecar__wKjByFffVNCAOYxDAAAN22i0y0c342.png","title":"车商城","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2f%23pvareaid%3d103544","id":1},{"imageurl":"http://app2.autoimg.cn/appdfs/g10/M0D/4B/1B/autohomecar__wKgH0VffVNuATQGOAAAL0GjPNhU218.png","title":"分期购车","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ffinance%2flist%2f3-0-0-0-0-0-0-0-0-1.html%3fisapp%3d1%23pvareaid%3d106577","id":2},{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M0C/4D/4E/autohomecar__wKgH5FffVOyAG6aXAAAMdPjXCQ0657.png","title":"养车之家","link":"autohome://insidebrowser?url=http%3a%2f%2fyc.m.autohome.com.cn%2findex.do%3f%26pvareaid%3d2008199%26PreciseAD%3dautohome_app_faxian","id":5},{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M0C/4D/50/autohomecar__wKgH5FffVPiAWjNCAAAOAgHJPpg848.png","title":"找二手车","link":"autohome://insidebrowser?url=http%3a%2f%2fm.che168.com%2fbeijing%2flist%2f%3fsourcename%3dmain%26pvareaid%3d101964","id":10},{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M04/4D/51/autohomecar__wKgH5FffVQKAWR6VAAAQXq8BOww940.png","title":"违章查询","link":"autohome://insidebrowser?url=http%3a%2f%2fwz.m.autohome.com.cn%2f%3ffrom%3dAutohomeApp%26pvareaid%3d103171","id":8},{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M04/4B/E7/autohomecar__wKjByVffVRSAKvx8AAAMkJE_FGY908.png","title":"购车计算","link":"","id":7},{"imageurl":"http://app2.autoimg.cn/appdfs/g19/M12/2B/F3/autohomecar__wKgFU1ffVb2AVd5KAAANCfS830A737.png","title":"团购活动","link":"autohome://insidebrowser?url=http%3a%2f%2ftuan.m.autohome.com.cn%2fapp%2fh5%2fhome","id":20},{"imageurl":"http://app2.autoimg.cn/appdfs/g21/M13/2C/8C/autohomecar__wKjBwlffVcyAKNfcAAAN_sl_K6c783.png","title":"爱车估值","link":"autohome://insidebrowser?url=http%3a%2f%2fm.che168.com%2fpinggu%2f%3fbuymark%3doaha10027%26sellmark%3doaha10026%26appversionbuy%3d2.08V%26appversionsell%3d2.04V%26hideheadfoot%3d1%26hidead%3d1%26pvareaid%3d101375","id":17},{"imageurl":"http://app2.autoimg.cn/appdfs/g9/M0A/46/E0/autohomecar__wKjBzlffTwuAAaG5AAALmavJuhY008.png","title":"全部","link":"","id":-1}],"cardtype":"-1","datasource":7,"description":"业务入口"},{"data":[{"imageurl":"http://app2.autoimg.cn/appdfs/g7/M04/6E/55/autohomecar__wKgH3Vf6ClqAc6qyAAESkRMoGzQ453.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d104499%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104499#pvareaid=2031179","pos":"2,5,1","cardlaunchid":"201"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g6/M00/6D/1D/autohomecar__wKgH3Ff6CpCAPcmvAAEsmnfIsXc573.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d104878%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104878#pvareaid=2031179","pos":"2,5,2","cardlaunchid":"201"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g8/M0C/70/BE/autohomecar__wKgH3lf6CrSAGZVIAAEQSuXfA4E221.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d104917%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104917#pvareaid=2031179","pos":"2,5,3","cardlaunchid":"201"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g21/M07/49/3D/autohomecar__wKgFVVf6CtaAVR8-AADvjpCr4ys940.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d104880%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=104880#pvareaid=2031179","pos":"2,5,4","cardlaunchid":"201"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g18/M02/6C/F9/autohomecar__wKjBxVf6CvyAOMjwAADQ3ernxg4169.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d103729%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=103729#pvareaid=2031179","pos":"2,5,5","cardlaunchid":"201"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g23/M07/4E/A4/autohomecar__wKjBwFf6CxqAHmBQAAEo6PGL3Y4021.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fjava.jia.autohome.com.cn%2fmappweb%2fitem%2fdetail%3fspu%3d103678%23pvareaid%3d2031179","statistics":{"cardtype":"13","link":"http://java.jia.autohome.com.cn/mappweb/item/detail?spu=103678#pvareaid=2031179","pos":"2,5,6","cardlaunchid":"201"}}],"cardtype":"13","datasource":10,"description":"限时抢购","title":"限时抢购","topblanktype":"2","bottomblanktype":"0","rightbtn":{"type":"2","data":"2016-10-13 00:00:00","link":"","statistics":{"cardtype":"13","link":"","pos":"2,5,98","cardlaunchid":"201"}}},{"data":[{"imageurl":"http://app2.autoimg.cn/g10/M13/2A/F3/wKgH0VfNOCqAWNidAADwGz5KdyE097.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fm.wz.qichecdn.com%2FJiaYou%2Foilv1.aspx%3Fplatformid%3DgsucTDsWOxw","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=http%3A%2F%2Fm.wz.qichecdn.com%2FJiaYou%2Foilv1.aspx%3Fplatformid%3DgsucTDsWOxw","pos":"2,6,1","cardlaunchid":"203"}},{"imageurl":"http://app2.autoimg.cn/g10/M00/4B/A1/wKgH0Vffm36ATC6pAAED3I3iG40855.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fcomm.app.autohome.com.cn%2Faspx%2Fthirdlogin.aspx%3Fkeytype%3D2%26islogin%3D-1%26callbackurl%3Dhttp%3A%2F%2Fbaoxian.autohome.com.cn%2Fmanage%2FappIndex","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=http%3A%2F%2Fcomm.app.autohome.com.cn%2Faspx%2Fthirdlogin.aspx%3Fkeytype%3D2%26islogin%3D-1%26callbackurl%3Dhttp%3A%2F%2Fbaoxian.autohome.com.cn%2Fmanage%2FappIndex","pos":"2,6,2","cardlaunchid":"203"}},{"imageurl":"http://app2.autoimg.cn/g16/M04/6D/07/wKgH5lf5nLGANMcGAADt8S8cndw388.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fjava.jia.autohome.com.cn%2Fmappweb%2Fitem%2FitemList%23pvareaid%3D2088113","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=http%3A%2F%2Fjava.jia.autohome.com.cn%2Fmappweb%2Fitem%2FitemList%23pvareaid%3D2088113","pos":"2,6,3","cardlaunchid":"203"}},{"imageurl":"http://app2.autoimg.cn/g20/M12/3D/B1/wKgFWVfrW4aAI4GSAAEBLR_v064680.jpg","link":"autohome://insidebrowser?url=https%3A%2F%2Fm.lechebang.com%2Fduijie%2Fqczj%2Findex","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=https%3A%2F%2Fm.lechebang.com%2Fduijie%2Fqczj%2Findex","pos":"2,6,4","cardlaunchid":"203"}},{"imageurl":"http://app2.autoimg.cn/g17/M09/53/1D/wKjBxlfozlyASOteAADvkgb6ktM592.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fm.qcds.com%2F%3Funionid%3D40","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=http%3A%2F%2Fm.qcds.com%2F%3Funionid%3D40","pos":"2,6,5","cardlaunchid":"203"}},{"imageurl":"http://app2.autoimg.cn/g17/M0D/68/70/wKgH51f5neyAbzEoAAD46Qii6zA379.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fzhida.kuanter.com%2Fhome.html%3Fenv%3Dqczj","statistics":{"cardtype":"9","link":"autohome://insidebrowser?url=http%3A%2F%2Fzhida.kuanter.com%2Fhome.html%3Fenv%3Dqczj","pos":"2,6,6","cardlaunchid":"203"}}],"cardtype":"9","datasource":0,"description":"田字小号专区","title":"服务专区","topblanktype":"2","bottomblanktype":"0","rightbtn":{"type":"0","data":"","link":"","statistics":{"cardtype":"9","link":"","pos":"2,6,98","cardlaunchid":"203"}},"serialnumber":"6"},{"data":[{"imageurl":"http://app2.autoimg.cn/appdfs/g19/M14/2D/98/autohomecar__wKjBxFffV7KAJmEYAAEiyGihPFk362.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2finout.tuhu.cn%2fClick.aspx%3fc_id%3d1680%26kw%3dk2%25E7%2594%25A8%25E7%259A%2584%25E6%2598%25AF%25E4%25BB%2580%25E4%25B9%2588%25E8%25BD%25AE%25E8%2583%258E","id":9029,"statistics":{"cardtype":"6","link":"http://inout.tuhu.cn/Click.aspx?c_id=1680&kw=k2%E7%94%A8%E7%9A%84%E6%98%AF%E4%BB%80%E4%B9%88%E8%BD%AE%E8%83%8E","pos":"2,9,1","cardlaunchid":"196"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g21/M0B/04/5A/autohomecar__wKgFWlfHvzyAV7C4AAEYpy0qxrc414.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fhd.j.autohome.com.cn%2floan%2floan%2factivityLzYk%3fpvareaid%3d2020146%26type%3d1","id":8939,"statistics":{"cardtype":"6","link":"http://hd.j.autohome.com.cn/loan/loan/activityLzYk?pvareaid=2020146&type=1","pos":"2,9,2","cardlaunchid":"196"}},{"imageurl":"http://app2.autoimg.cn/appdfs/g16/M0E/6F/27/autohomecar__wKjBx1f7J-yATRadAADoUVBGvB0718.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.1111.autohome.com.cn%2f%23pvareaid%3d2018155","id":9748,"statistics":{"cardtype":"6","link":"http://m.1111.autohome.com.cn/#pvareaid=2018155","pos":"2,9,3","cardlaunchid":"196"}}],"cardtype":"6","datasource":5,"description":"活动专区","title":"活动专区","topblanktype":"2","bottomblanktype":"0","rightbtn":{"type":"1","data":"更多活动","link":"autohome://insidebrowser?url=http%3a%2f%2fmobile.app.autohome.com.cn%2fdiscover_v7.0.0%2fmobile%2factivitylist.aspx%3fa%3d2%26pm%3d1%26v%3d7.0.0","statistics":{"cardtype":"6","link":"http://mobile.app.autohome.com.cn/discover_v7.0.0/mobile/activitylist.aspx?a=2&pm=1&v=7.0.0","pos":"2,9,98","cardlaunchid":"196"}}},{"data":[{"imageurl":"http://app2.autoimg.cn/g19/M14/38/E6/wKjBxFfoi3iAVR8gAAEK9CdWhd0604.jpg","link":"autohome://insidebrowser?url=http%3A%2F%2Fwww.10100000.com%2Fm%2Fdaikuan%2Foto%2F1.0%2Findex.html%3Futm_source%3Dphmd-mdhngnqczj%26utm_medium%3Dmkt%26utm_campaign%3Dmkt%26WT.mc_id%3DCXX-MDHNGNQCZJ-%26","statistics":{"cardtype":"8","link":"autohome://insidebrowser?url=http%3A%2F%2Fwww.10100000.com%2Fm%2Fdaikuan%2Foto%2F1.0%2Findex.html%3Futm_source%3Dphmd-mdhngnqczj%26utm_medium%3Dmkt%26utm_campaign%3Dmkt%26WT.mc_id%3DCXX-MDHNGNQCZJ-%26","pos":"2,10,1","cardlaunchid":"198"}}],"cardtype":"8","datasource":0,"description":"单帧小号横栏","topblanktype":"2","bottomblanktype":"0","serialnumber":"10"},{"data":[{"imageurl":"http://car2.autoimg.cn/cardfs/product/g4/M00/CA/9A/tp_autohomecar__wKgHy1eDI8SAMbSwAAHF7C2PTCc488.jpg","title":"沃尔沃XC60","subtitle":"平安汽融0息购车专场，成功办理汽车分期后10个工作日内获赠百元万里通积分","link":"autohome://insidebrowser?url=http%3a%2f%2fmall.m.autohome.com.cn%2fitem%2fapp%2fitem-60002166-0.html%23pvareaid%3d2018165","price":"100元","currentprice":"1元","subicontext":"","statistics":{"cardtype":"11","link":"http://mall.m.autohome.com.cn/item/app/item-60002166-0.html#pvareaid=2018165","pos":"2,11,1","cardlaunchid":"200"}},{"imageurl":"http://car2.autoimg.cn/cardfs/product/g19/M0C/06/1F/tp_autohomecar__wKjBxFfJQCWAYnb3AAElyP2Z0ZU416.jpg","title":"雪佛兰 科沃兹","subtitle":"购车即享2000元豪华购车礼包","link":"autohome://insidebrowser?url=http%3a%2f%2fmall.m.autohome.com.cn%2fitem%2fapp%2fitem-60002280-0.html%23pvareaid%3d2018165","price":"2000元","currentprice":"99元","subicontext":"","statistics":{"cardtype":"11","link":"http://mall.m.autohome.com.cn/item/app/item-60002280-0.html#pvareaid=2018165","pos":"2,11,2","cardlaunchid":"200"}},{"imageurl":"http://car3.autoimg.cn/cardfs/product/g23/M0A/E9/70/tp_autohomecar__wKgFXFbrsWmASwNpAAGDDh-iKzE619.jpg","title":"陆风X5 PLUS","subtitle":"1元抵扣百元试驾礼包","link":"autohome://insidebrowser?url=http%3a%2f%2fmall.m.autohome.com.cn%2fitem%2fapp%2fitem-60002306-0.html%23pvareaid%3d2018165","price":"100元","currentprice":"1元","subicontext":"","statistics":{"cardtype":"11","link":"http://mall.m.autohome.com.cn/item/app/item-60002306-0.html#pvareaid=2018165","pos":"2,11,3","cardlaunchid":"200"}},{"imageurl":"http://car3.autoimg.cn/cardfs/product/g19/M10/B1/12/tp_autohomecar__wKjBxFeIbDCAURxCAAFiFKA9n14112.jpg","title":"神骐T20","subtitle":"线上支付99元，到店购车可获价值598元行车记录仪","link":"autohome://insidebrowser?url=http%3a%2f%2fmall.m.autohome.com.cn%2fitem%2fapp%2fitem-60002048-0.html%23pvareaid%3d2018165","price":"598元","currentprice":"99元","subicontext":"","statistics":{"cardtype":"11","link":"http://mall.m.autohome.com.cn/item/app/item-60002048-0.html#pvareaid=2018165","pos":"2,11,4","cardlaunchid":"200"}}],"cardtype":"11","datasource":3,"description":"模块列表","title":"猜你喜欢","topblanktype":"2","bottomblanktype":"2","rightbtn":{"type":"0","data":"","link":"","statistics":{}}},{"data":[{"imageurl":"http://car2.autoimg.cn/cardfs/product/g19/M0D/B6/A2/tp_autohomecar__wKgFU1eN5B6ARmiaAAFFC8Nr_rQ040.jpg","title":"丰田 Fortuner 2016款 2.7L 自动挡中东版","subtitle":"全新2016款丰田Fortuner现车开售，无需等待！现在购车送价值1600元蓝牙音箱！全国（内蒙古因政策原因除外）均可协助上牌，4S店支持维修保养。订金金额：4999元。参数配置、图片信息仅供参考，实际信息请以实车为准！","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f133575-110100-0.html%3fisapp%3d1%23pvareaid%3d2018165","price":"","currentprice":"34.00万","subicontext":"","statistics":{"cardtype":"11","link":"http://m.mall.autohome.com.cn/detail/133575-110100-0.html?isapp=1#pvareaid=2018165","pos":"2,12,1","cardlaunchid":"362"}},{"imageurl":"http://car3.autoimg.cn/cardfs/product/g5/M0D/8B/91/tp_autohomecar__wKgHzFYE9EaAUYXZAAHjv1V88V4846.jpg","title":"东南 东南DX7 2015款 2.0T 手动运动豪华型","subtitle":"现金直降3000元！加4600超值装饰！中意混血，军工品质，2.0T动力随叫随到！超值装饰包括：原厂行车记录仪、上车踏板、汽车之家logo迎宾照地灯、3D全包围脚垫、卓棒蓝牙音箱。除卓棒音箱，其他已在原厂加装。","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f89852-110100-0.html%3fisapp%3d1%23pvareaid%3d2018165","price":"12.99万","currentprice":"12.69万","subicontext":"","statistics":{"cardtype":"11","link":"http://m.mall.autohome.com.cn/detail/89852-110100-0.html?isapp=1#pvareaid=2018165","pos":"2,12,2","cardlaunchid":"362"}},{"imageurl":"http://car3.autoimg.cn/cardfs/product/g13/M0E/CF/3F/tp_autohomecar__wKjBylY5eY-Afo7TAAE5ZNIIzks790.jpg","title":"斯柯达 明锐 2017款 1.6L 手动智行版","subtitle":"尊享12/18/24期0利率","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f111366-110100-0.html%3fisapp%3d1%23pvareaid%3d2018165","price":"13.99万","currentprice":"12.79万","subicontext":"","statistics":{"cardtype":"11","link":"http://m.mall.autohome.com.cn/detail/111366-110100-0.html?isapp=1#pvareaid=2018165","pos":"2,12,3","cardlaunchid":"362"}},{"imageurl":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103195440038-110.jpg","title":"本田 凌派 2015款 1.8L 自动舒适版","subtitle":"0首付，资料简单，门槛低","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f73362-110100-0.html%3fisapp%3d1%23pvareaid%3d2018165","price":"12.48万","currentprice":"10.99万","subicontext":"","statistics":{"cardtype":"11","link":"http://m.mall.autohome.com.cn/detail/73362-110100-0.html?isapp=1#pvareaid=2018165","pos":"2,12,4","cardlaunchid":"362"}}],"cardtype":"11","datasource":3,"description":"模块列表","title":"为我推荐","topblanktype":"0","bottomblanktype":"2","rightbtn":{"type":"0","data":"","link":"","statistics":{}}},{"isloadmore":true,"carmallurl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2f%3fisapp%3d1%23pvareaid%3d2018178","issmartrecommendpvtype":1,"data":[{"id":130898,"productid":0,"title":"丰田 卡罗拉 2016款 1.6L CVT GL-i炫酷版","shorttitle":"卡罗拉 2016款 1.6L CVT GL-i炫酷版","logo":"http://car3.autoimg.cn/cardfs/product/g7/M07/DE/EE/tp_autohomecar__wKgH3VeW8jWALTmtAAFrDL_Nl4U961.jpg","price":"12.48万","fctprice":"13.48万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f130898-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":3,"seriesid":526,"specid":24195,"seriesname":"卡罗拉","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":140971,"productid":0,"title":"雪佛兰 科帕奇 2015款 2.4L 四驱豪华版 5座","shorttitle":"科帕奇 2015款 2.4L 四驱豪华版 5座","logo":"http://car0.autoimg.cn/upload/2014/11/6/tp_20141106151256850-110.jpg","price":"19.49万","fctprice":"19.99万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f140971-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":71,"seriesid":2583,"specid":23060,"seriesname":"科帕奇","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":28437,"productid":0,"title":"本田 飞度 2014款 1.5L LX CVT舒适型","shorttitle":"飞度 2014款 1.5L LX CVT舒适型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103190904288-111.jpg","price":"7.90万","fctprice":"8.18万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f28437-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":14,"seriesid":81,"specid":19117,"seriesname":"飞度","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":86050,"productid":0,"title":"比亚迪 比亚迪S7 2015款 2.0T 升级版 自动豪华型","shorttitle":"比亚迪S7 2015款 2.0T 升级版 自动豪华型","logo":"http://car0.autoimg.cn/car/upload/2015/6/24/tp_20150624114311045-1110.jpg","price":"11.99万","fctprice":"11.99万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f86050-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":75,"seriesid":3059,"specid":22815,"seriesname":"比亚迪S7","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":86048,"productid":0,"title":"江淮 瑞风S3 2016款 1.5L 手动舒适型","shorttitle":"瑞风S3 2016款 1.5L 手动舒适型","logo":"http://car0.autoimg.cn/car/upload/2015/6/12/tp_20150612133404708-1110.jpg","price":"6.58万","fctprice":"6.58万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f86048-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":84,"seriesid":3080,"specid":23982,"seriesname":"瑞风S3","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":168905,"productid":0,"title":"别克 昂科拉 2015款 1.4T 自动两驱都市领先型","shorttitle":"昂科拉 2015款 1.4T 自动两驱都市领先型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103193423421-111.jpg","price":"16.89万","fctprice":"16.89万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f168905-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":38,"seriesid":2896,"specid":20419,"seriesname":"昂科拉","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":45471,"productid":0,"title":"雪铁龙 雪铁龙C5 2014款 2.0L 自动尊悦型","shorttitle":"雪铁龙C5 2014款 2.0L 自动尊悦型","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022134426675-111.jpg","price":"14.56万","fctprice":"18.19万","adinfo":"0首付，车价直降36300元","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f45471-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":72,"seriesid":792,"specid":19864,"seriesname":"雪铁龙C5","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":95776,"productid":0,"title":"荣威 荣威350 2015款 1.5L 手动豪华天窗版","shorttitle":"荣威350 2015款 1.5L 手动豪华天窗版","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103204520956-111.jpg","price":"6.37万","fctprice":"7.87万","adinfo":"尊享24期0利率","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f95776-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":19,"seriesid":2062,"specid":22982,"seriesname":"荣威350","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":107220,"productid":0,"title":"起亚 狮跑 2013款 2.0L 自动两驱版Premium","shorttitle":"狮跑 2013款 2.0L 自动两驱版Premium","logo":"http://car0.autoimg.cn/upload/2014/10/9/tp_2014100914310667126411.jpg","price":"14.58万","fctprice":"14.68万","adinfo":"尊享低利率","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f107220-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":62,"seriesid":565,"specid":16145,"seriesname":"狮跑","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":86562,"productid":0,"title":"东风风行 菱智 2016款 V3 1.5L 7座豪华型 国V","shorttitle":"菱智 2016款 V3 1.5L 7座豪华型 国V","logo":"http://car2.autoimg.cn/cardfs/product/g22/M02/B1/22/tp_autohomecar__wKjBwVeIbFKAKcJrAAGGLsnO-qc232.jpg","price":"6.59万","fctprice":"6.59万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f86562-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":165,"seriesid":2540,"specid":24401,"seriesname":"菱智","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":85609,"productid":0,"title":"别克 凯越 2015款 1.5L 自动经典型","shorttitle":"凯越 2015款 1.5L 自动经典型","logo":"http://car0.autoimg.cn/car/upload/2015/6/15/tp_20150615093150456264110.jpg","price":"8.00万","fctprice":"9.19万","adinfo":"2500元限时优惠！0首付，资料简单，门槛低 #凡在2016年9月19日-10月19日下单并在10月23日前下定金的用户，将获得总价2500元的优惠#","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f85609-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":38,"seriesid":875,"specid":22245,"seriesname":"凯越","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":130841,"productid":0,"title":"丰田 威驰 2016款 1.5L 自动智臻星耀版","shorttitle":"丰田 威驰 2016款 1.5L 自动智臻星耀版","logo":"http://car0.autoimg.cn/upload/2014/11/5/tp_20141105171804363-110.jpg","price":"7.98万","fctprice":"8.98万","adinfo":"60期还款无忧，手续简便，快至1天放款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f130841-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":3,"seriesid":111,"specid":24503,"seriesname":"威驰","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":166798,"productid":0,"title":"雪佛兰 爱唯欧 2014款 三厢 1.4SL MT 舒适版","shorttitle":"爱唯欧 2014款 三厢 1.4SL MT 舒适版","logo":"http://car0.autoimg.cn/upload/2014/11/7/tp_20141107170451802-111.jpg","price":"7.39万","fctprice":"7.39万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f166798-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":71,"seriesid":2348,"specid":19349,"seriesname":"爱唯欧","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":73421,"productid":0,"title":"金杯 金杯海狮 2011款 2.0L第五代快运王标准型4G20B","shorttitle":"金杯海狮 2011款 2.0L第五代快运王标准型4G20B","logo":"http://car2.autoimg.cn/cardfs/product/g6/M0E/CD/A9/tp_autohomecar__wKjB0VY4el2AHnlwAAFTll4jxQQ398.jpg","price":"5.00万","fctprice":"5.68万","adinfo":"0首付，资料简单，门槛低","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f73421-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":83,"seriesid":2810,"specid":1001139,"seriesname":"金杯海狮","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":73424,"productid":0,"title":"宝骏 乐驰 2012款 改款 1.0L 手动P-TEC标准型","shorttitle":"乐驰 2012款 改款 1.0L 手动P-TEC标准型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103192958050-110.jpg","price":"3.51万","fctprice":"3.98万","adinfo":"0首付，资料简单，门槛低","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f73424-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":120,"seriesid":155,"specid":13661,"seriesname":"乐驰","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":92217,"productid":0,"title":"雪佛兰 创酷 2016款 1.4T 自动两驱豪华型","shorttitle":"创酷 2016款 1.4T 自动两驱豪华型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103200845721-110.jpg","price":"12.39万","fctprice":"13.39万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f92217-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":71,"seriesid":3335,"specid":23285,"seriesname":"创酷","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":73486,"productid":0,"title":"雪铁龙 雪铁龙C4L 2013款 1.6L 自动劲享版","shorttitle":"雪铁龙C4L 2013款 1.6L 自动劲享版","logo":"http://car3.autoimg.cn/cardfs/product/g20/M0F/CB/49/tp_autohomecar__wKjBw1eiqbiAERGjAAFjXPJU56w547.jpg","price":"11.79万","fctprice":"13.39万","adinfo":"0首付，资料简单，门槛低","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f73486-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":72,"seriesid":2945,"specid":22146,"seriesname":"雪铁龙C4L","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":163204,"productid":0,"title":"别克 君越 2013款 2.4L SIDI领先舒适型","shorttitle":"君越 2013款 2.4L SIDI领先舒适型","logo":"http://car0.autoimg.cn/upload/2014/11/3/tp_20141103175443578-111.jpg","price":"23.59万","fctprice":"23.59万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f163204-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":38,"seriesid":834,"specid":16337,"seriesname":"君越","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":135150,"productid":0,"title":"哈弗 哈弗H6 2015款 运动版 1.5T 自动两驱尊享型","shorttitle":"哈弗H6 2015款 运动版 1.5T 自动两驱尊享型","logo":"http://car0.autoimg.cn/car/upload/2015/6/24/tp_20150624155527310-1110.jpg","price":"14.23万","fctprice":"14.58万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f135150-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":181,"seriesid":2123,"specid":22868,"seriesname":"哈弗H6","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0},{"id":92637,"productid":0,"title":"别克 别克GL8 2014款 3.0L GT豪华商务豪雅版","shorttitle":"别克GL8 2014款 3.0L GT豪华商务豪雅版","logo":"http://car0.autoimg.cn/upload/2014/10/22/tp_20141022132155699-110.jpg","price":"36.49万","fctprice":"36.99万","adinfo":"首付低至20%，60期无忧还款","murl":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2fdetail%2f92637-110100-0.html%3fisapp%3d1%23pvareaid%3d2018164","carlable":"","state":"现货充足","brandid":38,"seriesid":166,"specid":18726,"seriesname":"别克GL8","count":0,"type":0,"ishistory":false,"pvid":"14761465749358641799byr5aVGJXl1B","isoperation":0}],"cardtype":"-1","datasource":2,"description":"商品列表","title":"商品列表"}]}
     */

    private int returncode;
    private String message;
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
        /**
         * data : [{"imageurl":"http://app2.autoimg.cn/appdfs/g14/M0A/6B/9D/autohomecar__wKjByVf5zi2AZiTuAAJSWSnupas591.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.1111.autohome.com.cn%2f%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g17/M07/64/A4/autohomecar__wKgH2Ff6DOaAFQkPAALRjkIock4362.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f9%2f930%2f%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g23/M06/4A/81/autohomecar__wKgFV1f6EU2ALX9UAACur81xd_A596.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fhd.j.autohome.com.cn%2floan%2floan%2fsqty%3ftype%3dty%23pvareaid%3d106574"},{"imageurl":"http://app2.autoimg.cn/appdfs/g7/M0D/68/E2/autohomecar__wKgHzlf58h2AEZtVAAJTMu2PiLQ326.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f9%2fgcj%2f%3fisapp%3d1%23pvareaid%3d104735"},{"imageurl":"http://app2.autoimg.cn/appdfs/g16/M09/6D/BB/autohomecar__wKgH5lf57oOAX4zlAAGMH86kYkw614.jpg","link":"autohome://insidebrowser?url=http%3a%2f%2fm.mall.autohome.com.cn%2ftopic%2f2016%2f10%2fxdyd%2f%23pvareaid%3d104735"}]
         * cardtype : -1
         * datasource : 6
         * description : 焦点图
         */

        private List<CardlistBean> cardlist;

        public List<CardlistBean> getCardlist() {
            return cardlist;
        }

        public void setCardlist(List<CardlistBean> cardlist) {
            this.cardlist = cardlist;
        }

        public static class CardlistBean {
            private String cardtype;
            private int datasource;
            private String description;
            /**
             * imageurl : http://app2.autoimg.cn/appdfs/g14/M0A/6B/9D/autohomecar__wKjByVf5zi2AZiTuAAJSWSnupas591.jpg
             * link : autohome://insidebrowser?url=http%3a%2f%2fm.1111.autohome.com.cn%2f%23pvareaid%3d104735
             */

            private List<DataBean> data;

            public String getCardtype() {
                return cardtype;
            }

            public void setCardtype(String cardtype) {
                this.cardtype = cardtype;
            }

            public int getDatasource() {
                return datasource;
            }

            public void setDatasource(int datasource) {
                this.datasource = datasource;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {
                private String imageurl;
                private String link;
                private String Title;

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String title) {
                    Title = title;
                }

                public String getImageurl() {
                    return imageurl;
                }

                public void setImageurl(String imageurl) {
                    this.imageurl = imageurl;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }
        }
    }
}
