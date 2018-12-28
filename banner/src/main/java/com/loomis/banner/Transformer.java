package com.loomis.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.loomis.banner.transformer.AccordionTransformer;
import com.loomis.banner.transformer.BackgroundToForegroundTransformer;
import com.loomis.banner.transformer.CubeInTransformer;
import com.loomis.banner.transformer.CubeOutTransformer;
import com.loomis.banner.transformer.DefaultTransformer;
import com.loomis.banner.transformer.DepthPageTransformer;
import com.loomis.banner.transformer.FlipHorizontalTransformer;
import com.loomis.banner.transformer.FlipVerticalTransformer;
import com.loomis.banner.transformer.ForegroundToBackgroundTransformer;
import com.loomis.banner.transformer.RotateDownTransformer;
import com.loomis.banner.transformer.RotateUpTransformer;
import com.loomis.banner.transformer.ScaleInOutTransformer;
import com.loomis.banner.transformer.StackTransformer;
import com.loomis.banner.transformer.TabletTransformer;
import com.loomis.banner.transformer.ZoomInTransformer;
import com.loomis.banner.transformer.ZoomOutSlideTransformer;
import com.loomis.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
