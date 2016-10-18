/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates.api

import uk.gov.hmrc.hmrcemailrenderer.domain.MessageTemplate
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.ApiDeveloperHub


/**
  * Templates used by the API Platform.
  */
object ApiTemplates {
  val title = "API Platform"

  val templates = Seq(
    MessageTemplate.create(
      templateId = "apiDeveloperEmailVerification",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "Verify your email address",
      plainTemplate = txt.verificationEmail.f,
      htmlTemplate = html.verificationEmail.f
    ),
    MessageTemplate.create(
      templateId = "apiDeveloperPasswordReset",
      service = ApiDeveloperHub,
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      subject = "Reset your password",
      plainTemplate = txt.passwordResetEmail.f,
      htmlTemplate = html.passwordResetEmail.f
    ),
    MessageTemplate.create(
      templateId = "apiDeveloperChangedPasswordConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "You have reset your password",
      plainTemplate = txt.passwordChangedConfirmationEmail.f,
      htmlTemplate = html.passwordChangedConfirmationEmail.f
    ),
    MessageTemplate.create(
      templateId = "apiAddedRegisteredDeveloperAsCollaboratorConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "You have been added to an application",
      plainTemplate = txt.apiAddedRegisteredDeveloperAsCollaboratorConfirmation.f,
      htmlTemplate = html.apiAddedRegisteredDeveloperAsCollaboratorConfirmation.f
    ),
    MessageTemplate.create(
      templateId = "apiAddedUnregisteredDeveloperAsCollaboratorConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "You have been added to an application",
      plainTemplate = txt.apiAddedUnregisteredDeveloperAsCollaboratorConfirmation.f,
      htmlTemplate = html.apiAddedUnregisteredDeveloperAsCollaboratorConfirmation.f
    ),
    MessageTemplate.create(
      templateId = "apiAddedDeveloperAsCollaboratorNotification",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "A collaborator has been added to your application",
      plainTemplate = txt.apiAddedDeveloperAsCollaboratorNotification.f,
      htmlTemplate = html.apiAddedDeveloperAsCollaboratorNotification.f
    ),
    MessageTemplate.create(
      templateId = "apiRemovedCollaboratorConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "You have been removed from an application",
      plainTemplate = txt.apiRemovedCollaboratorConfirmation.f,
      htmlTemplate = html.apiRemovedCollaboratorConfirmation.f
    ),
    MessageTemplate.create(
      templateId = "apiRemovedCollaboratorNotification",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "A collaborator has been removed from your application",
      plainTemplate = txt.apiRemovedCollaboratorNotification.f,
      htmlTemplate = html.apiRemovedCollaboratorNotification.f
    ),
    MessageTemplate.create(
      templateId = "apiApplicationApprovedGatekeeperConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "Application name approved",
      plainTemplate = txt.apiApplicationApprovedGatekeeperConfirmation.f,
      htmlTemplate = html.apiApplicationApprovedGatekeeperConfirmation.f
    ),
    MessageTemplate.create(
      templateId = "apiApplicationApprovedAdminConfirmation",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "Application name approved: Verify your email address",
      plainTemplate = txt.apiApplicationApprovedAdminConfirmation.f,
      htmlTemplate = html.apiApplicationApprovedAdminConfirmation.f
    ),
    MessageTemplate.create(
      templateId = "apiApplicationApprovedNotification",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "Application name approved",
      plainTemplate = txt.apiApplicationApprovedNotification.f,
      htmlTemplate = html.apiApplicationApprovedNotification.f
    ),
    MessageTemplate.create(
      templateId = "apiApplicationRejectedNotification",
      fromAddress = "HMRC API Developer Hub <noreply@tax.service.gov.uk>",
      service = ApiDeveloperHub,
      subject = "Application not approved",
      plainTemplate = txt.apiApplicationRejectedNotification.f,
      htmlTemplate = html.apiApplicationRejectedNotification.f
    )
  )
}