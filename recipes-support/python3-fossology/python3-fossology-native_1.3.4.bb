# SPDX-FileCopyrightText: 2021 Fred Liu <yclw3d2y@live.com>
#
# SPDX-License-Identifier: MIT

SUMMARY = "A library to automate Fossology from Python scripts"
HOMEPAGE = "https://github.com/fossology/fossology-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=cb16b221232b0f18f17c0adc029f25ce"

SRC_URI[sha256sum] = "4473ba81a7342c2cb47221d05186e745f305cce2f02a562a9726a2559788e274"

inherit pypi setuptools3 native

RDEPENDS_${PN} += "python3-core python3-datetime python3-json python3-logging python3-requests"
#    tenacity
