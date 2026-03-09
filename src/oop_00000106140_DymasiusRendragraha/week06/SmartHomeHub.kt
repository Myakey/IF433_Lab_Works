package oop_00000106140_DymasiusRendragraha.week06

class SmartHomeHub(val devices: MutableList<SmartDevice> = mutableListOf()) {
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOfAllSwitches() {
        for(device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for(device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}