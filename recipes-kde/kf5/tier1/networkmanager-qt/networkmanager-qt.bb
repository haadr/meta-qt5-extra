SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig cmake_auto_align_paths cmake_lib

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0f7f67be5fcdc8eb89f4045efa7af3b8"
SRC_URI[sha256sum] = "08f73ced96866b9dfded574a87c9e887dc907fc510d2764a4aa09315511cedf9"

CMAKE_ALIGN_SYSROOT[1] = "KF5NetworkManagerQt, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "KF5NetworkManagerQt, -S;${libdir}, -S;${_IMPORT_PREFIX}/${baselib}"
