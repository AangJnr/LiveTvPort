/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dazn.business.recommendation;

import android.media.tv.TvContract;
import android.net.Uri;

import com.dazn.business.data.api.Program;

public final class WatchedProgram {
    private final Program mProgram;
    private final long mWatchStartTimeMs;
    private final long mWatchEndTimeMs;

    public WatchedProgram(Program program, long watchStartTimeMs, long watchEndTimeMs) {
        mProgram = program;
        mWatchStartTimeMs = watchStartTimeMs;
        mWatchEndTimeMs = watchEndTimeMs;
    }

    public long getWatchStartTimeMs() {
        return mWatchStartTimeMs;
    }

    public long getWatchEndTimeMs() {
        return mWatchEndTimeMs;
    }

    public long getWatchedDurationMs() {
        return mWatchEndTimeMs - mWatchStartTimeMs;
    }

    public Program getProgram() {
        return mProgram;
    }


    public static final class WatchedPrograms implements TvContract.BaseTvColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://android.media.tv/watched_program");
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/watched_program";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/watched_program";
        public static final String COLUMN_WATCH_START_TIME_UTC_MILLIS = "watch_start_time_utc_millis";
        public static final String COLUMN_WATCH_END_TIME_UTC_MILLIS = "watch_end_time_utc_millis";
        public static final String COLUMN_CHANNEL_ID = "channel_id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_START_TIME_UTC_MILLIS = "start_time_utc_millis";
        public static final String COLUMN_END_TIME_UTC_MILLIS = "end_time_utc_millis";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_INTERNAL_TUNE_PARAMS = "tune_params";
        public static final String COLUMN_INTERNAL_SESSION_TOKEN = "session_token";

        private WatchedPrograms() {
        }
    }
}
