LOCAL_PATH := $(call my-dir) 
include $(CLEAR_VARS)
LOCAL_C_INCLUDES += $(LOCAL_PATH)/include
LOCAL_ARM_MODE := arm
LOCAL_MODULE    := wangvutils 
LOCAL_SRC_FILES := wangvutils.cpp 
LOCAL_LDLIBS	:= -llog -landroid
include $(BUILD_SHARED_LIBRARY)
