package com.test.lifecycle_apt.utils;

/**
 * 常量
 */
public class Constants {


    /**
     * 注解存放的包名
     */
    public static final String ANNOTATION_PKG = "com.test.lifecycle_annotation";

    /**
     *
     */
    public static final String KEY_HOST_NAME = "host";
    public static final String STRING_EMPTY = "";
    public static final String DEFAULT_HOST = "default";

    /**
     * 路由注解的全类名
     */
    public static final String ANNOTATION_TYPE_ROUTE = ANNOTATION_PKG + ".RouteNode";


    /**
     * 日志前缀
     */
    public static final String PREFIX_OF_LOGGER = "[Router-Annotation-APT]-- ";


    // System interface
    public static final String ACTIVITY = "android.app.Activity";
    public static final String FRAGMENT = "android.app.Fragment";
    public static final String FRAGMENT_V4 = "android.support.v4.app.Fragment";
    public static final String SERVICE = "android.app.Service";
    public static final String PARCELABLE = "android.os.Parcelable";

    // Java type
    public static final String LANG = "java.lang";
    public static final String BYTE = LANG + ".Byte";
    public static final String SHORT = LANG + ".Short";
    public static final String INTEGER = LANG + ".Integer";
    public static final String LONG = LANG + ".Long";
    public static final String FLOAT = LANG + ".Float";
    public static final String DOUBEL = LANG + ".Double";
    public static final String BOOLEAN = LANG + ".Boolean";
    public static final String STRING = LANG + ".String";

}