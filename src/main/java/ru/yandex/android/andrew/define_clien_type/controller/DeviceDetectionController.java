package ru.yandex.android.andrew.define_clien_type.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Andrew on 07.02.2016.
 */
@Controller
public class DeviceDetectionController {

    @ResponseBody
    @RequestMapping("/detect-device")
    public String detectDevice(Device device) {
        String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "PC client";
        } else if (device.isMobile()) {
            deviceType = "smartphone client";
        } else if (device.isTablet()) {
            deviceType = "tablet client";
        }
        return deviceType;

    }
}
