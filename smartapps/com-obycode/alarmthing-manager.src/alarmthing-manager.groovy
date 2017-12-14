/**
 *  AlarmThing
 *
 *  Copyright 2014 obycode
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "AlarmThing Manager",
    namespace: "com.obycode",
    author: "obycode",
    description: "Connect your alarm with a SmartShield and make SmartThings see each sensor as an individual thing.",
    category: "Safety & Security",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png",
    iconX3Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")


preferences {
  section("Connect to the alarm...") {
    input "theAlarm", "capability.alarm", title: "Which?", multiple: false, required: true
        input "theHub", "hub", title: "On which hub?", multiple: false, required: true
  }
    section("Zones Setup") {
    input "zoneName1", "text", title: "Zone 1 Name", required:false
    input "zoneType1", "enum", title: "Zone 1 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName2", "text", title: "Zone 2 Name", required:false
    input "zoneType2", "enum", title: "Zone 2 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName3", "text", title: "Zone 3 Name", required:false
    input "zoneType3", "enum", title: "Zone 3 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName4", "text", title: "Zone 4 Name", required:false
    input "zoneType4", "enum", title: "Zone 4 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName5", "text", title: "Zone 5 Name", required:false
    input "zoneType5", "enum", title: "Zone 5 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName6", "text", title: "Zone 6 Name", required:false
    input "zoneType6", "enum", title: "Zone 6 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName7", "text", title: "Zone 7 Name", required:false
    input "zoneType7", "enum", title: "Zone 7 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName8", "text", title: "Zone 8 Name", required:false
    input "zoneType8", "enum", title: "Zone 8 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName9", "text", title: "Zone 9 Name", required:false
    input "zoneType9", "enum", title: "Zone 9 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName10", "text", title: "Zone 10 Name", required:false
    input "zoneType10", "enum", title: "Zone 10 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName11", "text", title: "Zone 11 Name", required:false
    input "zoneType11", "enum", title: "Zone 11 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName12", "text", title: "Zone 12 Name", required:false
    input "zoneType12", "enum", title: "Zone 12 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName13", "text", title: "Zone 13 Name", required:false
    input "zoneType13", "enum", title: "Zone 13 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName14", "text", title: "Zone 14 Name", required:false
    input "zoneType14", "enum", title: "Zone 14 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName15", "text", title: "Zone 15 Name", required:false
    input "zoneType15", "enum", title: "Zone 15 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
    input "zoneName16", "text", title: "Zone 16 Name", required:false
    input "zoneType16", "enum", title: "Zone 16 Kind", required:false, metadata: [ values: ['Motion Sensor','Contact Sensor','Glass Break Sensor'] ]
  }
}

def installed() {
  log.debug "Installed with settings: ${settings}"

  initialize()
}

def updated() {
  log.debug "Updated with settings: ${settings}"

  //uninstalled()
  //initialize()
}

def initialize() {
  subscribe(theAlarm, "zoneChanged", zoneChanged)
    if (zoneName1 && zoneType1) {
    log.debug "create a $zoneType1 named $zoneName1"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType1, "zone001", theHub.id, [label:zoneName1, name:zoneType1])
  }
  if (zoneName2 && zoneType2) {
    log.debug "create a $zoneType2 named $zoneName2"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType2, "zone002", theHub.id, [label:zoneName2, name:zoneType2])
  }
  if (zoneName3 && zoneType3) {
    log.debug "create a $zoneType3 named $zoneName3"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType3, "zone003", theHub.id, [label:zoneName3, name:zoneType3])
  }
  if (zoneName4 && zoneType4) {
    log.debug "create a $zoneType4 named $zoneName4"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType4, "zone004", theHub.id, [label:zoneName4, name:zoneType4])
  }
  if (zoneName5 && zoneType5) {
    log.debug "create a $zoneType5 named $zoneName5"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType5, "zone005", theHub.id, [label:zoneName5, name:zoneType5])
  }
  if (zoneName6 && zoneType6) {
    log.debug "create a $zoneType6 named $zoneName6"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType6, "zone006", theHub.id, [label:zoneName6, name:zoneType6])
  }
  if (zoneName7 && zoneType7) {
    log.debug "create a $zoneType7 named $zoneName7"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType7, "zone007", theHub.id, [label:zoneName7, name:zoneType7])
  }
  if (zoneName8 && zoneType8) {
    log.debug "create a $zoneType8 named $zoneName8"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType8, "zone008", theHub.id, [label:zoneName8, name:zoneType8])
  }
  if (zoneName9 && zoneType9) {
    log.debug "create a $zoneType9 named $zoneName9"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType9, "zone009", theHub.id, [label:zoneName9, name:zoneType9])
  }
  if (zoneName10 && zoneType10) {
    log.debug "create a $zoneType10 named $zoneName10"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType10, "zone010", theHub.id, [label:zoneName10, name:zoneType10])
  }
  if (zoneName11 && zoneType11) {
    log.debug "create a $zoneType11 named $zoneName11"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType11, "zone011", theHub.id, [label:zoneName11, name:zoneType11])
  }
  if (zoneName12 && zoneType12) {
    log.debug "create a $zoneType12 named $zoneName12"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType12, "zone012", theHub.id, [label:zoneName12, name:zoneType12])
  }
  if (zoneName13 && zoneType13) {
    log.debug "create a $zoneType13 named $zoneName13"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType13, "zone013", theHub.id, [label:zoneName13, name:zoneType13])
  }
  if (zoneName14 && zoneType14) {
    log.debug "create a $zoneType14 named $zoneName14"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType14, "zone014", theHub.id, [label:zoneName14, name:zoneType14])
  }
  if (zoneName15 && zoneType15) {
    log.debug "create a $zoneType15 named $zoneName15"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType15, "zone015", theHub.id, [label:zoneName15, name:zoneType15])
  }
  if (zoneName16 && zoneType16) {
    log.debug "create a $zoneType16 named $zoneName16"
    def d = addChildDevice("com.obycode", "Virtual " + zoneType16, "zone016", theHub.id, [label:zoneName16, name:zoneType16])
  }
}

def uninstalled() {
  unsubscribe()
  def delete = getChildDevices()
    delete.each {
        deleteChildDevice(it.deviceNetworkId)
    }
    //deleteList(getChildDevices())
}

def deleteList(l) {
  l.each {
      def dni = it.deviceNetworkId
      deleteChildDevice(dni)
     }
}

def zoneChanged(evt) {
  log.debug "got evt.value: ${evt.value}"
  def parts = evt.value.tokenize('.')
    log.debug "got parts: $parts"
    def zone = parts[0]
  log.debug "Zone $zone changed"
  def children = getChildDevices()
  def sensor = children.find{ d -> d.deviceNetworkId == "zone$zone" }
    log.debug "got sensor $sensor"
    if (sensor) {
      switch(parts[1]) {
        case "open":
        sensor.open()
            break
        case "close":
          sensor.close()
            break
        }
    }
}