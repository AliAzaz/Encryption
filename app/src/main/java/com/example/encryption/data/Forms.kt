package com.example.encryption.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.encryption.CONSTANTS

@Entity(tableName = CONSTANTS.TABLE_FORMS)
class Forms {

    @Ignore
    val _projectName = "AUDIT"

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

    @ColumnInfo
    var uid = ""
    var sa1 = ""
    var istatus = ""
    var deviceID = ""
    var devicetagID = ""
    var appversion = ""
    var synced = ""
    var synced_date = ""

}