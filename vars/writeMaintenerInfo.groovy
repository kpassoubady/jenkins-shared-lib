#!/usr/bin/env groovy
import com.kavinschool.lib.Constants

void call(args) {
    def maintainer = args
    if (args == null || (args instanceof String && args.trim().empty)) {
        maintainer = Constants.DEFAULT_MAINTAINER_NAME
    }
    echo "Mainterners of this project: $maintainer"
}
