package com.macbitsgoa.comrades

import com.macbitsgoa.comrades.persistance.Course

const val FCM_TYPE_MATERIAL_ADDED = "material_added"
const val FCM_TYPE_CSA_NOTIFS = "csa_notifs"
const val FCM_KEY_TYPE = "type"
const val USERS = "users"
const val TOPIC_COURSE_UPDATES = BuildConfig.BUILD_TYPE + "CourseUpdates"
const val TOPIC_CSA_NEWS = BuildConfig.BUILD_TYPE + "CsaNotifications"
const val COURSES = "courses"
const val CONTRIBUTORS = "contributors"
const val CONTRIBUTORS_NAME = "name"
const val FB_NODE_COURSE_MATERIAL = "courseMaterial"
/**
 * Get fcm channel name corresponding to the course
 */
fun getTopicForCourse(course: Course) = BuildConfig.BUILD_TYPE + "Course${course.id}"
