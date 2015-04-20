/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package scalate.quickstart.action

object $_scalate_$DefaultLayout_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      val helper: xitrum.Action = $_scalate_$_context.attribute("helper")
      import helper._
      ;{
        val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
        import context._
        
        
                import quickstart.action._

        $_scalate_$_context << ( "<!DOCTYPE html>\n<html>\n  <head>\n    <meta content=\"width=600\" name=\"viewport\"/>\n  </head>\n</html>\n<title>R User Conference 2015</title>\n<!-- /// font icons  /// -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fonts/fontawesome/css/font-awesome.min.css\">\n<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fonts/linecons/css/linecons.css\">\n<!-- ///  google fonts  /// -->\n<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>\n<!-- ///  animate.css  /// -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/plugins/animate/animate.css\">\n<!-- ///  bootstrap-select.css /// -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/plugins/select/bootstrap-select.css\">\n<!-- ///  bootstrap.css  /// -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-3.1.1/css/bootstrap.css\">\n<!-- ///  main CSS file  /// -->\n<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/main.css\">\n" );
        $_scalate_$_context << ( $_scalate_$_indent ( "", $_scalate_$_context.valueUnescaped(
           antiCsrfMeta
        ) ) );
        $_scalate_$_context << ( "\n<link" );
        $_scalate_$_context << $_scalate_$_attributes( $_scalate_$_context, List( (
            "rel"
          ,
            "shortcut icon"
          ), (
            "href"
          ,
                        publicUrl("favicon.ico")

        ) ) )
        $_scalate_$_context << ( "/>\n<style>\n/* responsive text queries */\n@media screen and (max-width: 992px) {\np,{\nfont-size: 95%;\n}\nh1 {\nfont-size: 24px;\n}\n}\n@media screen and (max-width: 768px) {\np, {\nfont-size: 90%;\n}\nh1 {\nfont-size: 20px;\n}\n.counter .count-digits p {\nwidth: 100px;\nheight: 100px;\nline-height: 100px;\n}\n}\n</style>\n<body>\n<div id=\"navigation\" class=\"wrapper\">\n<div class=\"navbar navbar-fixed-top navbar-inverse\" id=\"top\">\n<div class=\"navbar-inner\">\n<div class=\"inner\">\n<div class=\"container-fluid\">\n<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n<span class=\"sr-only\">Toggle navigation</span>\n<i class=\"fa fa-bars\" style=\"color:white\"></i> <font style=\"size:24px; color:white\">Menu</font>\n</button>\n<div class=\" navbar-collapse collapse\" id=\"navbar\">\n<ul class=\"nav navbar-nav navbar-right\" id=\"main-menu\">\n<li><a href=\"/\"><b><font style=\"color:white\">Main</font></b></a></li>\n<!-- programs -> program \uc73c\ub85c \ubcc0\uacbd -->\n<li><a href=\"/Schedule\"><b><font style=\"color:white;\">Program</font></b></a></li>\n<li><a href=\"/Speaker\"><b><font style=\"color:white\">Speakers</font></b></a></li>\n<li><a href=\"/Info\"><b><font style=\"color:white\">Infomation</font></b></a></li>\n<li><a href=\"/Contact\"><b><font style=\"color:white\">Registration</font></b></a></li>\n</ul>\n</div>\n<!--/.nav-collapse -->\n</div>\n</div>\n</div>\n</div>\n</div>\n\n<!-- ///  begin promo  /// -->\n<div class=\"promo\" id=\"home\" style=\"background-image:url(/img/r-korea.jpg);\">\n<!-- ///  semitransparent layer  /// -->\n<div class=\"color-correction\"></div>\n<!-- ///  begin entry  /// -->\n<div class=\"container\">\n<div class=\"row\">\n<!-- ///  begin text section  /// -->\n<div class=\"col-md-6 wow fadeInDown\" data-wow-duration=\"2s\">\n<div class=\"promo-text\">\n<h1><i class=\"fa fa-signal success-color\"></i> <b>R</b> User Conference 2015</h1>\n<hr>\n<p class=\"lead\"> Real </p>\n</div>\n</div>\n<!-- ///  end text section  /// -->\n</div>\n</div>\n<!-- ///  end entry  /// -->\n</div>\n<!-- ///  end promo  /// -->\n" );
        $_scalate_$_context << ( $_scalate_$_preserve ( $_scalate_$_context.valueUnescaped(
           jsRenderFlash()
        ) ) );
        $_scalate_$_context << ( "\n" );
        $_scalate_$_context << ( $_scalate_$_indent ( "", $_scalate_$_context.valueUnescaped(
           renderedView
        ) ) );
        $_scalate_$_context << ( "\n" );
        $_scalate_$_context << ( $_scalate_$_indent ( "", $_scalate_$_context.valueUnescaped(
           jsForView
        ) ) );
        $_scalate_$_context << ( "\n<footer class=\"main-footer\">\n<div class=\"container\">\n<div class=\"row\">\n</div>\n</div>\n</footer>\n<script src=\"https://maps.googleapis.com/maps/api/js?sensor=false\"></script>\n<script src=\"assets/js/libs/modernizr-latest.js\"></script>\n<script src=\"assets/js/libs/jquery-1.11.0.min.js\"></script>\n<script src=\"bootstrap-3.1.1/js/bootstrap.min.js\"></script>\n<!-- ///  plugins  /// -->\n<script src=\"assets/js/plugins/fitvids/jquery.fitvids.js\"></script>\n<script src=\"assets/js/plugins/select/bootstrap-select.min.js\"></script>\n<script src=\"assets/js/plugins/gmap3/gmap3.min.js\"></script>\n<script src=\"assets/js/plugins/scrollTo/jquery.scrollTo.js\"></script>\n<script src=\"assets/js/plugins/nav/jquery.nav.js\"></script>\n<script src=\"assets/js/plugins/countdown/countdown.js\"></script>\n<script src=\"assets/js/plugins/placeholder/jquery.placeholder.js\"></script>\n<script src=\"assets/js/plugins/validator/jquery.form-validator.min.js\"></script>\n<script src=\"assets/js/plugins/wow/wow.min.js\"></script>\n<script src=\"assets/js/main.js\"></script>\n" );
      }
    }
  }
}


class $_scalate_$DefaultLayout_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$DefaultLayout_jade.$_scalate_$render(context)
}
