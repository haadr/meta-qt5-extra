SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c0428ebe112085464fcb8284aeb7220c"
SRC_URI[sha256sum] = "34881a269bdae7e3643ab73290931859437fde72042a066170e7467422408065"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
