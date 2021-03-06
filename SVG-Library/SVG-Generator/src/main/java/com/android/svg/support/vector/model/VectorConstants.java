package com.android.svg.support.vector.model;

/**
 * In this class, defines all the element names and attribute names of a vector xml file.
 *
 * @author Megatron King
 * @since 2016/8/31 20:42
 */

public class VectorConstants {

    // vector tags
    public static final String TAG_VECTOR = "vector";
    public static final String TAG_PATH = "path";
    public static final String TAG_CLIP_PATH = "clip-path";
    public static final String TAG_GROUP = "group";

    // vector attributes
    public static final String ATTR_NAME = "name";
    public static final String ATTR_ALPHA = "alpha";
    public static final String ATTR_WIDTH = "width";
    public static final String ATTR_HEIGHT = "height";
    public static final String ATTR_VIEWPORT_WIDTH = "viewportWidth";
    public static final String ATTR_VIEWPORT_HEIGHT = "viewportHeight";
    public static final String ATTR_AUTO_MIRRORED = "autoMirrored";
    public static final String ATTR_TINT_MODE = "tintMode";
    public static final String ATTR_TINT = "tint";

    // path attributes
    public static final String ATTR_PATH_DATA = "pathData";
    public static final String ATTR_FILL_COLOR = "fillColor";
    public static final String ATTR_FILL_ALPHA = "fillAlpha";
    public static final String ATTR_STROKE_LINE_CAP = "strokeLineCap";
    public static final String ATTR_STROKE_LINE_JOIN = "strokeLineJoin";
    public static final String ATTR_STROKE_MITER_LIMIT = "strokeMiterLimit";
    public static final String ATTR_STROKE_COLOR= "strokeColor";
    public static final String ATTR_STROKE_ALPHA = "strokeAlpha";
    public static final String ATTR_STROKE_WIDTH = "strokeWidth";
    public static final String ATTR_TRIM_PATH_END = "trimPathEnd";
    public static final String ATTR_TRIM_PATH_OFFSET = "trimPathOffset";
    public static final String ATTR_TRIM_PATH_START = "trimPathStart";

    // group attributes
    public static final String ATTR_PIVOTX = "pivotX";
    public static final String ATTR_PIVOTY = "pivotY";
    public static final String ATTR_SCALEX = "scaleX";
    public static final String ATTR_SCALEY = "scaleY";
    public static final String ATTR_ROTATION = "rotation";
    public static final String ATTR_TRANSLATEX = "translateX";
    public static final String ATTR_TRANSLATEY = "translateY";
}
